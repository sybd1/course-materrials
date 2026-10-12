package com.ohgiraffers.section05.overloading;

public class Application {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // 오버로딩 적용 전
        System.out.println(calc.addTwoInts(10, 20));
        System.out.println(calc.addTwoDouble(10.5, 20.5));

        // 오버로딩 적용 후
        // 자바가 인자를 보고 알맞는 메서드를 '알아서' 찾아준다.
        System.out.println(calc.add(20, 30));
        System.out.println(calc.add(20.5, 30.5));
        System.out.println(calc.add(40, 50, 60));

        System.out.println("안녕");
    }
}
