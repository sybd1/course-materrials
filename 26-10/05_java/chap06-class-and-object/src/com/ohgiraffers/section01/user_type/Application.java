package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {

        // 개별 변수의 한계
        int age = 20;
        String name = "홍길동";

        System.out.println(name + age);

        /* [사용자 정의 자료형 사용하기]
        * 1. 객체가 가져야할 데이터와 기능을 클래스로 정의한다.
        * 2. new 연산자를 통해 클래스에 정의된 객체를 생성한다.
        * 3. 생성된 객체를 가리키는 참조 변수를 선언하고 참조값을 저장한다.
        *  */

        // 자료형 변수명 = new 클래스명();
        Member member = new Member();

        // 생성된 객체(인스턴스)의 필드(속성)에 값 대입
        // '.'(참조 연산자)를 사용한다.
        member.id = "user01";
        member.pwd = "pass01";
        member.age = 5;
        member.gender = '여';
        member.hobby = new String[]{"볼링", "배드민턴", "영화"};

        System.out.println("아이디: " + member.id);
        System.out.println("성별: " + member.gender);

        for (int i = 0; i < member.hobby.length; i++) {
            System.out.println(member.hobby[i] + " ");
        }

        member.age = -5;
        System.out.println(member.age);
    }
}
