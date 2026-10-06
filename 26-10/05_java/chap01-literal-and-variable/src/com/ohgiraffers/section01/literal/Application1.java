package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        // 숫자 형태의 값
        /* 정수 형태의 값 출력 */
        System.out.println(123);

        /* 실수 형태의 값 출력 */
        System.out.println(1.23);

        // 문자 형태의 값
        System.out.println('a');    // 문자 형태의 값은 홑따옴표로 감싸 주어야 한다.
//      System.out.println('abc');  // 두 개 이상은 문자로 취급하지 않기 때문에 에러
//      System.out.println('');     // 아무 문자도 기록되지 않은 경우 에러 발생

        // 문자열 형태의 값
        System.out.println("abc");
        System.out.println("");
        System.out.println("a");

        /* 논리 형태의 값*/
        System.out.println(true);
        System.out.println(false);


    }
}
