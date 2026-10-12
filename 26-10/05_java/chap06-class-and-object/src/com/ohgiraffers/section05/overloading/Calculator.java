package com.ohgiraffers.section05.overloading;

public class Calculator {

    // 오버로딩 적용 전

    // 정수 2개 더하기
    public int addTwoInts(int num1, int num2) {
        return num1 + num2;
    }

    // 실수 2개 더하기
    public double addTwoDouble(double num1, double num2) {
        return num1 + num2;
    }

    // 오버로딩 적용
    public int add(int num1, int num2) {
        System.out.println("정수 2개를 더하는 add()");
        return num1 + num2;
    }

    // 타입이 달라서 오버로딩 성립!!
    public double add(double num1, double num2) {
        System.out.println("실수 2개를 더하는 add()");
        return num1 + num2;
    }

    // 개수가 달라서 오버로딩 성립!!
    public int add(int num1, int num2, int num3) {
        System.out.println("정수 3개를 더하는 add()");
        return num1 + num2 + num3;
    }

}
