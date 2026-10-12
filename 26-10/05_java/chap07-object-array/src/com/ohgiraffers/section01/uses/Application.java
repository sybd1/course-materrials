package com.ohgiraffers.section01.uses;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        /* 요구사항
         * 1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
         * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
         * 3. 회원 아이디로 원하는 회원을 검색
         */

        /*
         * 한 클래스에 입력, 처리, 데이터 저장을 모두 작성하지 않고 역할에 따라 나눈다.
         * Application은 사용자 입력과 메뉴 진행, Service는 회원 관련 처리,
         * Repository는 회원 데이터 보관을 담당한다.
         * React에서도 화면 컴포넌트와 API·상태 처리 코드를 분리했던 것처럼 역할을 나누는 연습이다.
         * 이후 Spring에서 배우는 계층 분리의 기초 형태를 미리 경험하는 예제이다.
         */
        Scanner sc = new Scanner(System.in);

        MemberService memberService = new MemberService();

        while(true) {
            System.out.println("=====회원 관리 프로그램=====");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("3. 회원 아이디로 검색");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();
            /*
             * nextInt()는 숫자만 읽고 입력할 때 누른 엔터는 남겨둔다.
             * 남은 엔터를 먼저 읽어 없애야 메뉴 3의 nextLine()이 검색 입력을 정상적으로 기다린다.
             */
            sc.nextLine();

            switch (no) {
                case 1 : memberService.signUpMembers(); break;
                case 2 : memberService.showAllMembers(); break;
                case 3 : memberService.searchMemberById(sc); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();  // Scanner 자원 반납
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다"); break;
            }
        }
    }
}
