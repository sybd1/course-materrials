package com.ohgiraffers.section01.exception;

public class
ExceptionTest {

    /*
    * throw: 현재 위치에서 예외 객체를 직접 던진다.
    * throws: 이 메서드가 처리하지 않은 예외를 호출한 곳으로 위임한다. */
    public void checkEnoughMoney (int price, int money) throws Exception {

        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if (money >= price) {
            System.out.println("상품을 구입하기 돈이 충분합니다.");
        } else {
            throw new Exception("돈이 부족합니다!!!"); // 예외 발생
        }

        // 예외가 발생했다면 위 throw에서 실행흐름이 끝나므로 이 줄까지 내려오지 않는다.
        System.out.println("즐거운 쇼핑 하세요~~");
    }
}
