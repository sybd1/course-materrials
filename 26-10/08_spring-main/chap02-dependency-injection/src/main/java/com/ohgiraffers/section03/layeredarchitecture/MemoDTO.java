package com.ohgiraffers.section03.layeredarchitecture;

public class MemoDTO {

    private final int id;
    private final String content;

    public MemoDTO(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "MemoDTO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
