package com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    public FireCar() {
        super();    // 부모 클래스의 기본 생성자를 호출
        System.out.println("FireCar 기본 생성자 호출...");
    }

    /* 오버라이딩
    * 부모에게 물려받은 메서드를 자식의 목적에 맞게 같은 형태로 다시 작성하는 것 */
    @Override   // 컴파일러가 부모 메서드를 올바르게 재정의했는지 검사
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빠아아아아아아앙!!!!!!!!!!!@@@@@!@!@!@!@!@!@!@!@!");
        } else {
            System.out.println("소방차가 갑니다 비키세요~!!!");
        }
    }

    public void sprayWater() {
        System.out.println("불난 곳을 발견 했습니다!! 물을 뿌립니다!!🫗🫗🫗🫗");
    }
}
