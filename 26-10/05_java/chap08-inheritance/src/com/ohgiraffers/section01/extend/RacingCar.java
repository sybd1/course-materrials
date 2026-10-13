package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    @Override
    public void run() {
        super.run();    // 부모의 메서드 호출
        System.out.println("레이싱카가 전속력으로 질주합니다!!!!!!!!!!!");
    }
}
