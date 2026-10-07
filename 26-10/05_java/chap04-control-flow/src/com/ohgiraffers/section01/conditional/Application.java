package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Application app = new Application();
//        app.testSimpleIf();
//        app.testIfElse();
//        app.testIfElseIf();
//        app.testSwitch();
        app.testSwitch2();
    }

    // 1. if
    public void testSimpleIf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    // 2. if-else
    public void testIfElse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력: ");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("홀수입니다.");
        } else {
            // if 조건문이 false 일 때
            System.out.println("짝수입니다.");
        }
    }

    public void testIfElseIf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 점수를 입력: ");
        int point = sc.nextInt();
        String grade = "";

        if (point >= 90) {
            grade = "A";
            if (point >= 95) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 50) {
            grade = "D";
            if (point >= 55) {
                grade += "+";
            }
        } else {
            grade = "F";
        }
        System.out.println("점수는 " + point + "점 이고, 성적은 " + grade + "입니다.");
    }

    // switch
    public void testSwitch() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 (+, -) : ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            default:    // 위의 case에 아무것도 해당하지 않을 때
                System.out.println("잘못된 연산 기호를 입력하셨습니다.");
                return; // 메소드 종료
        }
        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void testSwitch2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력: ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 (+, -) : ");
        char op = sc.next().charAt(0);

        int result2 = switch (op) {
            case '+' -> first + second;
            case '-' -> first - second;
            default -> {
                System.out.println("잘못된 기호입니다.");
                yield 0;    // 중괄호로 작성한 case에서 값을 반환할 때 yield를 사용
                // return은 메소드 전체를 종료하지만 yield는 switch 결과 값만 정한다
            }
        };
        System.out.println("향상된 switch결과: " + first + " " + op + " " + second + " = " + result2);
    }
}
