package com.ohgiraffers.section03.branching;

public class Application {
    public static void main(String[] args) {

        /*
         * break
         * - 가장 가까운 switch문 또는 반복문 종료
         * - 라벨이 있으면 지정한 반복문 종료 가능
         *
         * continue
         * - 가장 가까운 반복문의 현재 회차만 중단
         * - 다음 조건 검사/증가 단계로 이동
         *
         * return
         * - 반복문이 아니라 현재 메소드 전체 종료
         * */

        Application app = new Application();
//        app.simpleBreak();
//        app.nestedForLoop();
        app.simpleContinue();
    }


    public void simpleBreak() {

        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            System.out.println(i);

            if (i == 10) {
                break;  // 가장 가까운 반복문을 즉시 중단하고 탈출
            }
            i++;
        }
        System.out.println("최종 합은 " + sum + "입니다.");
    }

    public void nestedForLoop() {
        // 바깥 쪽 for문: 단 (2 ~ 9) 제어
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("---" + dan + "단 ---");
            // 안 쪽 for문: 곱하는 수 (1 ~ 9) 제어
            for (int su = 1; su <= 9; su++) {
                if (su > 3) {
                    break;  // 안쪽 for문을 탈출
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }

    // continue: 다음 반복 회차로 이동
    public void simpleContinue() {

        System.out.println("4와 5의 공배수만 출력");
        for (int i = 1; i <= 100; i++) {
            // 4의 배수이면서 동시에 5의 배수가 아니라면
            if (!(i % 4 == 0 && i % 5 == 0)) {
                continue;   // 이번 반복회차를 건너뛰고 다음 반복으로 이동
            }
            System.out.println(i);
        }
    }

    // 중첩 반복문 전체를 종료하는 방법
    // 1. 라벨 사용
    public void nestedForLoop2() {
        // 바깥 쪽 for문: 단 (2 ~ 9) 제어
        ohgiraffers:
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("---" + dan + "단 ---");
            // 안 쪽 for문: 곱하는 수 (1 ~ 9) 제어
            for (int su = 1; su <= 9; su++) {
                if (su > 3) {
                    break ohgiraffers;  // 라벨이 붙은 반복문을 탈출
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }

    // boolean flag 변수 사용
    public void nestedForLoop3() {
        // 바깥 쪽 for문: 단 (2 ~ 9) 제어

        boolean isBreak = false;


        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("---" + dan + "단 ---");
            // 안 쪽 for문: 곱하는 수 (1 ~ 9) 제어
            for (int su = 1; su <= 9; su++) {
                if (su > 3) {
                    isBreak = true; // 탈출 신호 보냄
                    break;  // 우선 가장 가까운 반복문을 탈출
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            if (isBreak) {
                break;  // 탈출신호가 있다면 바깥 반복문도 탈출
            }
            System.out.println();
        }
    }

}
