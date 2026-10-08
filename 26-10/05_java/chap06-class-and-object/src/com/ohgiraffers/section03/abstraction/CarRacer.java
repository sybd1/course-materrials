package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    // 자신의 자동차를 가지고 있다 (소유 관계 / has-a 관계)
    private final Car myCar = new Car();

    // 시동을 걸도록 명령
    public void startUp() {
        myCar.startUp();
    }
    // 엑셀 밟도록 명령
    public void stepAccelerator() {
        myCar.go();
    }
    // 브레이크 밟도록 명령
    public void stopBrake() {
        myCar.stop();
    }
    // 시동 끄도록 명령
    public void turnOff() {
        myCar.turnOff();
    }
}
