package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /*
         * [상속]
         * 공통 상태와 기능을 부모 클래스에 정의하고, 자식 클래스가 그것을
         * 이어받아 사용하거나 자신의 목적에 맞게 확장하는 방법
         *  */

        Car car = new Car();

        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar fireCar = new FireCar();

        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        fireCar.sprayWater();

        RacingCar racingCar = new RacingCar();
        fireCar.run();
        fireCar.soundHorn();
    }
}
