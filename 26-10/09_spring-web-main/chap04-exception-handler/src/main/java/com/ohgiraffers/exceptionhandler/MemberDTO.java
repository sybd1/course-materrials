package com.ohgiraffers.exceptionhandler;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class MemberDTO {

    @Min(value = 1, message = "회원 번호는 1 이상이어야 합니다.")
    private int no;
    @NotBlank(message = "회원 이름이 비어 있을 수 없습니다.")
    private String name;
    @Min(value = 0, message = "회원 나이는 0 이상이어야 합니다.")
    private int age;

    public MemberDTO() {
    }

    public MemberDTO(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
