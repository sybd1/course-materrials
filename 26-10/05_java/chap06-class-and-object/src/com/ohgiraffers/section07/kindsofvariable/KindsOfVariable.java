package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable {

    /* 클래스 영역에 작성하는 변수를 필드라고 한다.*/

    /* 인스턴스 변수(non-static)
    * - new로 객체를 만들 때 Heap 메모리에 생성된다.
    * - 같은 클래스 내 어느 메서드에서든 접근 가능하다.
    * - 객체가 살아있는 동안만 존재한다. */
    private int instanceNum;

    /* static 변수(클래스 변수)
    *  - 프로그램 시작시 static 영역에 단 하나만 생성된다.
    * - 모든 인스턴스(객체)가 공유하며 프로그램 종료시까지 사라지지 않는다. */
    private static int staticNum;

    // 지역 변수: 메서드 안에 선언하는 변수
    public void method(int num) {
        // num: 매개 변수도 지역 변수의 일종

        // 메서드가 호출 될 때 Stack 메모리에 생성된다.
        // '}' 를 만나는 순간 즉시 사라진다.
        int localNum;

        System.out.println(num);
//        System.out.println(localNum); // 초기화 전 사용 불가

        // 인스턴스 변수: 같은 클래스 내 어디서든 접근 가능
        System.out.println(instanceNum);
        // 클래스 변수: 프로그램 전체에서 접근 가능
        System.out.println(staticNum);
    }

    public void method2() {
        System.out.println(instanceNum);
        System.out.println(staticNum);
//        System.out.println(localNum); // 지역 변수는 해당 지역(블럭)에서만 사용 가능
    }
}
