package com.ohgiraffers.section01.method;

public class Nmixx {
    public static void main(String[] args) {

        Nmixx nswer = new Nmixx();
        System.out.println(nswer.member("지우", 22));

        String result2 = Nmixx.member("설윤", 23);
        System.out.println(result2);
    }

    public static String member(String name, int age) {
        String introduce = "안녕하세요. " + name + "입니다. " + age + "살 입니다.";
        return introduce;
    }
}
