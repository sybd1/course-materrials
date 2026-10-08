package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* [추상화]
        복잡한 내부 구현은 숨기고, 외부에는 필요한 기능만 의미있는 이름으로 보여주는 것

        * 프로그램에서 필요한 특징과 기능만 골라 객체로 표현하고,
        * 사용하는 쪽에는 복잡한 내부 처리 대신에 필요한 기능을 보여주는 설계 방식이다.
        * */

        // 카레이서 객체 생성
        CarRacer racer = new CarRacer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 시동 걸기");
            System.out.println("2. 엑셀 밟기");
            System.out.println("3. 브레이크 밟기");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            int no = sc.nextInt();

            switch (no) {
                // 사용자는 카레이서에게 '요청'
                case 1:
                    racer.startUp();
                    break;
                case 2:
                    racer.stepAccelerator();
                    break;
                case 3:
                    racer.stopBrake();
                    break;
                case 4:
                    racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택했습니다.");
                    break;
            }
        }
    }
}
