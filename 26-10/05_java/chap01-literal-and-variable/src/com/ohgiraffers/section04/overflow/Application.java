package com.ohgiraffers.section04.overflow;

public class Application {
    public static void main(String[] args) {

        byte num = 127; // byte의 최대 저장 범위
        num++; // 1 증가

        // Overflow: 자료형이 저장할 수 있는 최대 범위를 넘어가는 현상
        System.out.println(num);    // -128

        byte num2 = -128;
        num2--;

        // Underflow: 최솟값보다 작아져 반대편 최대값으로 돌아가는 현상
        System.out.println(num2);   // 127

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;

        System.out.println("multi = " + multi);

        // 계산 시 이미 두 값이 int이므로 연산 중에 이미 오버플로우가 발생
        long longNum = firstNum * secondNum;
        System.out.println("longNum = " + longNum);

        // 피연산자 하나를 미리 long으로 변환하면 전체 계산이 long으로 처리
        long result = (long)firstNum * secondNum;
        System.out.println("result = " + result);
    }
}
