package com.ohgiraffers.section01.operator;

public class Application1 {
    public static void main(String[] args) {

        /* 산술연산자 (+, -, *, /, %)
         * 정수끼리 나눈 결과는 소수 부분을 버린다 */
        System.out.println("10 / 3 = " + (10 / 3));

        /* 산술 복합 대입 연산자 (+=, -=, *=, /=, %=) */

        int num = 12;
        num += 3;   // num = num + 3;
        System.out.println("num = " + num);

        /* 증감 연산자 (++, --) */

        num++;  // 현재 값을 먼저 사용한 뒤 1 증가
        ++num;  // 먼저 1증가한 뒤 증가한 값 사용

        int firstNum = 10;

        int result = ++firstNum * 3;
        System.out.println("result = " + result);

        /* 비교 연산자 (==, !=, >, <, >=, <=) */

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        /* 문자열 비교 */
        String str1 = "java";
        String str2 = "java";

        System.out.println(str1 == str2);   // 두 변수가 같은 객체를 가리키는지 비교

        // 문자열의 내용이 같은지 비교할 때는 equals()를 사용
        System.out.println(str1.equals(str2));

        /* 자바에는 === 연산자가 없다.
         * 기본 자료형은 선언된 타입이 정해져 있으므로 JS의 느슨한 동등 비교처럼
         * 1과 "1"을 자동 변환해 비교하지 않는다. 타입이 맞지 않으면 컴파일 오류가 발생한다. */

        /* boolean은 == 또는 !=로 값이 같은지 비교할 수 있다. */
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 == bool2);
    }
}
