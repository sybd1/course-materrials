package com.ohgiraffers.section01.exception;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(1000, 5000);
        } catch (Exception e) { // Exception 타입의 예외가 전달 되었을 때 실행
            System.out.println("돈이 부족하여 상품 구입 불가!" + e.getMessage());
        }

        try {
            et.checkEnoughMoney(1000, 500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            /* 예외가 발생해 전달된 호출 경로 확인
            * 실제 서비스에서는 보통 로깅 도구를 이용하여 필요한 정보를 기록한다. */
        }

        System.out.println("프로그램을 정상적으로 종료합니다.");

        Deque<Integer> stack = new ArrayDeque<>();
        try {
        stack.pop();    // NoSuchElementException: 요소를 찾을 수 없습니다.

        } catch (NoSuchElementException e) {
            System.out.println("빈 스택에서는 값을 꺼낼 수 없습니다.");
        }

        /*
        * - Checked Exception: 컴파일러가 처리 또는 throws 선언을 확인한다.
        * - UnChecked Exception: 컴파일러가 처리를 강제하지 않으며 주로 실행 중 발견된다. */
    }
}
