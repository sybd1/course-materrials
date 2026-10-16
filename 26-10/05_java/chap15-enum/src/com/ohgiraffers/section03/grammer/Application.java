package com.ohgiraffers.section03.grammer;

public class Application {
    public static void main(String[] args) {

        UserRole admin = UserRole.ADMIN;    // new 키워드로 객체 생성

        UserRole guest = UserRole.GUEST;    // 이미 위에서 준비된 상수 참조

        System.out.println(admin.name());
        System.out.println(admin.getDescription());
        System.out.println(admin.getNameToLowerCase());

    }
}
