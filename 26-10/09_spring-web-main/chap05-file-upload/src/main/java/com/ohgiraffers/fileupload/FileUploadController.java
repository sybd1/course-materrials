package com.ohgiraffers.fileupload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/api/v1/files")
public class FileUploadController {

    private final Path uploadRoot;

    public FileUploadController(@Value("${file.upload-dir}") String uploadDir) {
        this.uploadRoot = Paths.get(uploadDir).toAbsolutePath().normalize();
    }

    private String extractExtension(String originFileName) {
        int lastDotIndex = originFileName.lastIndexOf(".");

        if (lastDotIndex == -1) {
            return "";
        }

        return originFileName.substring(lastDotIndex);
    }

    private void cleanupSavedFiles(List<FileDTO> uploadedFiles,
                                   Exception originalException) {
        for (FileDTO uploadedFile : uploadedFiles) {
            Path savedPath = uploadRoot.resolve(uploadedFile.getFilePath()).normalize();
            try {
                if (savedPath.startsWith(uploadRoot)) {
                    Files.deleteIfExists(savedPath);
                }
            } catch (IOException cleanupException) {
                originalException.addSuppressed(cleanupException);
            }
        }
    }
}
