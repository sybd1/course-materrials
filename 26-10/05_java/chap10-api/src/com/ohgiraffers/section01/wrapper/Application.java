package com.ohgiraffers.section01.wrapper;

public class Application {
    public static void main(String[] args) {
        /*
         * [Wrapper]
         * 기본 자료형의 값을 객체 형태로 감싸는 클래스
         *
         * 문자열과 기본자료형 사이의 변환 기능을 제공하고,
         * 기본자료형을 객체가 필요한 곳에서 사용할 수 있게 한다.
         * */

        String heightStr = "175.5";
        String weightStr = "69.3";

        System.out.println(heightStr + weightStr);  // 문자열 결과값

        // Parsing -> 문자열 데이터를 원하는 기본자료형으로 변환하는 과정
        // Wrapper 클래스들은 'parse자료형()' 형태의 static 메서드를 제공한다.
        double height = Double.parseDouble(heightStr);
        double weight = Double.parseDouble(weightStr);
//        double result = Double.parseDouble("abc");    // NumberFormatException
//        int result = Integer.parseInt("3.14");    // NumberFormatException

        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println("bmi = " + bmi);

        /*
         * Boxing
         * 기본자료형의 값을 Wrapper 객체로 감싸는 것
         *
         * Unboxing
         * 객체에서 기본자료형으로 값을 꺼내는 것
         * */
        Integer age = 20;       // Auto-Boxing
        int unboxedAge = age;   // Auto-Unboxing

        /*
         * Wrapper 객체는 null을 가질 수 있다.
         * null을 기본자료형으로 언박싱하면 NullPointerException이 발생한다.
         * */
        Integer nullableAge = null;
//        int dangerAge = nullableAge;

        /* Wrapper는 객체이므로 값 비교에 equals()를 사용한다.
        * (==) 는 내부 최적화에 따라 결과가 달라질 수 있으므로 Wrapper 값 비교 방법으로 사용하지 않는다. */
        Integer num1 = 128;
        Integer num2 = 128;
        System.out.println(num1.equals(num2));

        // 숫자 -> 문자열
        // String.valueOf(값)
        // 값 + ""
        String bmiStr = String.valueOf(bmi);

        System.out.println("당신의 BMI는 " + bmiStr + "입니다.");
    }
}
