package com.ohgiraffers.jackson;

import java.time.LocalDate;

public class MemberDTO {

    private int no;
    private String name;
    private int age;
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
