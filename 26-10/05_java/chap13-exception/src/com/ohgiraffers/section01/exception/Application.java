package com.ohgiraffers.section01.exception;

public class Application {
    public static void main(String[] args) throws Exception {

//        int number = Integer.parseInt("abc");

        /*
        *
        * 예외처리(Exception Handling)
        *
        * 프로그램 실행중 발생 문제를 감지하고 안내/기록/복구 방법을 정하는 것*/

        ExceptionTest et = new ExceptionTest();

        et.checkEnoughMoney(10000, 50000);

        et.checkEnoughMoney(50000, 10000);

        System.out.println("프로그램을 종료합니다.");



    }
}
