package com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();

        // 객체 배열 선언
        Car[] carArray = new Car[3];

        System.out.println(carArray[0]);    // null

//        carArray[0].driveMaxSpeed();  // NullPointerException 발생

        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);

        carArray[0].driveMaxSpeed();

        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }
        System.out.println();

        // 객체 배열도 선언과 동시에 객체 배열 초기화가 가능하다
        Car[] carArray2 = {
                new Car("페라리", 300),
                new Car("람보르기니", 350),
                new Car("롤스로이스", 250),
        };

        for (Car car : carArray2) {
            car.driveMaxSpeed();
        }

        // 가장 빠른 자동차 찾기: 객체 배열에 최댓값 탐색 방법 적용
        Car fastestCar = carArray[0];

        for (int i = 1; i < carArray.length; i++) {
            if(carArray[i].getMaxSpeed() > fastestCar.getMaxSpeed()) {
                fastestCar = carArray[i];
            }
        }
        System.out.println(fastestCar.getModelName() + "가 가장 빠르며, 시속은" + fastestCar.getMaxSpeed() + "입니다.");
    }
}
