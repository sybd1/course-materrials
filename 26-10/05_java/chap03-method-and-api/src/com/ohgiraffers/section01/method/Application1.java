package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {

        /* method
         * 어떤 특정 작업을 수행하기 위한 명령문의 집합
         *
         * 호출 방법
         * 클래스명 사용할 이름 = new 클래스명();    // 객체 생성
         * 사용할이름.메소드명();                  // 메소드 호출
         * */

        System.out.println("main 호출됨");

        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main 종료됨");
    }

    public void methodA() {

        System.out.println("methodA() 호출함");

        methodB();

        System.out.println("methodA() 종료됨");
    }

    public void methodB() {
        System.out.println("methodB() 호출함");

        methodC();

        System.out.println("methodB() 종료됨");
    }

    public  void methodC() {
        System.out.println("methodc() 호출함");

        System.out.println("methodc() 종료됨");
    }
}
