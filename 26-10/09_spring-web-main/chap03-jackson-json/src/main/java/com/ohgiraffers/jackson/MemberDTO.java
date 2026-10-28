package com.ohgiraffers.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class MemberDTO {

    /* 직렬화와 역직렬화 모두 Java의 no를 JSON의 memberNo와 연결한다. */
    @JsonProperty("memberNo")
    private int no;
    private String name;
    private int age;
    /* LocalDate를 yyyy-MM-dd로 문자열로 주고 받으며 형식이 다르면 역직렬화에 실패한다. */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate enrollDate;

    public MemberDTO() {
    }

    public MemberDTO(int no, String name, int age, LocalDate enrollDate) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.enrollDate = enrollDate;
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

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDate enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
