package com.ohgiraffers.fileupload;

public class FileDTO {

    /*
     * 업로드 결과를 클라이언트에 JSON으로 내려주기 위한 DTO.
     * 실제 파일 데이터 자체가 아니라 저장된 파일의 메타 정보를 담는다.
     */

    /* 사용자가 업로드한 원래 파일명 */
    private String originFileName;

    /* 서버에 충돌 방지를 위해 UUID로 저장한 파일명 */
    private String savedFileName;

    /* 업로드 루트 디렉터리를 기준으로 한 상대 경로 */
    private String filePath;

    /* 사용자가 함께 보낸 파일 설명 */
    private String fileDescription;

    /* 파일 크기(byte) */
    private long fileSize;

    /* text/plain, image/png 같은 파일 MIME 타입 */
    private String contentType;

    public FileDTO() {
    }

    public FileDTO(String originFileName, String savedFileName, String filePath, String fileDescription, long fileSize, String contentType) {
        this.originFileName = originFileName;
        this.savedFileName = savedFileName;
        this.filePath = filePath;
        this.fileDescription = fileDescription;
        this.fileSize = fileSize;
        this.contentType = contentType;
    }

    public String getOriginFileName() {
        return originFileName;
    }

    public void setOriginFileName(String originFileName) {
        this.originFileName = originFileName;
    }

    public String getSavedFileName() {
        return savedFileName;
    }

    public void setSavedFileName(String savedFileName) {
        this.savedFileName = savedFileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "FileDTO{" +
                "originFileName='" + originFileName + '\'' +
                ", savedFileName='" + savedFileName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileDescription='" + fileDescription + '\'' +
                ", fileSize=" + fileSize +
                ", contentType='" + contentType + '\'' +
                '}';
    }
}
