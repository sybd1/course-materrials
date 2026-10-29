package com.ohgiraffers.fileupload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@RestController
@RequestMapping("/api/v1/files")
public class FileUploadController {

    private final Path uploadRoot;

    public FileUploadController(@Value("${file.upload-dir}") String uploadDir) {
        // 설정값을 정규화된 절대 경로로 바꾸고 모든 업로드의 저장 기준으로 사용
        this.uploadRoot = Paths.get(uploadDir).toAbsolutePath().normalize();
    }

    @PostMapping("/single")
    public ResponseEntity<Map<String, Object>> uploadSingleFile(
            /* FormData의 "file" key와 이름이 같아야 연결된다. */
            @RequestParam("file") MultipartFile file,
            @RequestParam(value = "description", required = false) String description) throws IOException {

        FileDTO uploadFile = saveFile(file, "single", description);
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "단일 파일 업로드 성공!");
        response.put("file", uploadFile);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/multiple")
    public ResponseEntity<Map<String, Object>> uploadMultipleFiles(
            @RequestParam("files") List<MultipartFile> files,
            @RequestParam(value = "description", required = false) String description) throws IOException {

        if (files == null || files.isEmpty()) {
            throw new IllegalStateException("업로드할 파일 목록이 비어 있습니다.");
        }

        List<FileDTO> uploadedFiles = new ArrayList<>();

        try {
            for (MultipartFile file : files) {
                uploadedFiles.add(saveFile(file, "multiple", description));
            }
        } catch (IOException | RuntimeException e) {
            // 중간 실패 시 앞서 저장한 파일을 정리한 뒤 원래 예외를 다시 던진다
            cleanupSavedFiles(uploadedFiles, e);
            throw e;    // 업로드가 실패했다는 사실을 다시 전달
        }
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "다중 파일 업로드 성공");
        response.put("count", uploadedFiles.size());
        response.put("files", uploadedFiles);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
}


private FileDTO saveFile(MultipartFile file, String directoryName, String description) throws IOException {

    validateFile(file);

    /* uploads/single 또는 uploads/multiple 처럼 요청 종류별 하위 디렉토리를 만든다. */
    Path uploadPath = uploadRoot.resolve(directoryName).normalize();
    Files.createDirectories(uploadPath);

    // 원본 파일 이름 검증
    String originFileName = StringUtils.cleanPath(file.getOriginalFilename());
    if (originFileName.contains("..")) {
        throw new IllegalArgumentException("파일명에 올바르지 않은 경로가 포함되어 있습니다.");
    }

    originFileName = Paths.get(originFileName).getFileName().toString();
    String extension = extractExtension(originFileName);

    // UUID를 사용하여 중복되지 않는 문자를 만든 뒤, 원본 확장자를 붙여 파일 저장명을 완성한다.
    String savedFileName = UUID.randomUUID().toString().replace("-", "") + extension;

    // 실제 디스크에 쓸 위치
    Path targetPath = uploadPath.resolve(savedFileName).normalize();

    if (!targetPath.startsWith(uploadPath)) {
        throw new IllegalArgumentException("저장할 파일 경로가 올바르지 않습니다.");
    }

    // 실제 파일을 만든다
    file.transferTo(targetPath);

    // 절대 경로 대신 업로드 루트 기준 상대 경로만 응답하여 서버 내부 경로 노출을 줄인다.
    String relativePath = uploadRoot.relativize(targetPath).toString().replace('\\', '/');

    return new FileDTO(
            originFileName,
            savedFileName,
            relativePath,
            description,
            file.getSize(),
            file.getContentType()
    );
}

// 파일이 유효한지 검사
private void validateFile(MultipartFile file) {
    // 빈 파일 요청은 정상 업로드 처리하지 않는다
    if (file == null || file.isEmpty()) {
        throw new IllegalStateException("업로드할 파일이 비어있습니다.");
    }
    // 파일명 확인
    if (file.getOriginalFilename() == null || file.getOriginalFilename().isBlank()) {
        throw new IllegalStateException("원본 파일명이 없습니다.");
    }
}

// 확장자 추출
private String extractExtension(String originFileName) {
    int lastDotIndex = originFileName.lastIndexOf(".");

    if (lastDotIndex == -1) {
        return "";
    }

    return originFileName.substring(lastDotIndex);
}

// 다중 파일 업로드 중 중간 실패 시, 이미 저장된 파일을 정리하는 메서드.
private void cleanupSavedFiles(List<FileDTO> uploadedFiles,
                               Exception originalException) {
    for (FileDTO uploadedFile : uploadedFiles) {
        Path savedPath = uploadRoot.resolve(uploadedFile.getFilePath()).normalize();
        try {
            if (savedPath.startsWith(uploadRoot)) {
                Files.deleteIfExists(savedPath);
            }
        } catch (IOException cleanupException) {
            // 정리 실패가 최초 저장 실패의 원인을 덮어쓰지 않도록 ...?
            originalException.addSuppressed(cleanupException);
        }
    }
}
}
