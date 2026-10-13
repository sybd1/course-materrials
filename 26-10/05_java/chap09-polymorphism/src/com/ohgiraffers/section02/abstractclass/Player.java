package com.ohgiraffers.section02.abstractclass;

public abstract class Player {
    /*
    * [추상 클래스]
    * - abstract 키워드로 선언
    * - 일반 메서드와 추상 메서드를 모두 가질 수 있다.
    * - 추상 메서드는 몸체가 없으며 자식 클래스에서 반드시 오버라이딩 해야한다.
    * - 참조변수 타입으로는 사용할 수 있다 - 다형성 적용 가능.*/

    // 몸체가 없는 추상 메서드
    public abstract void attack();

    // 일반 메서드
    public void levelUp() {
        System.out.println("레벨업!!");
    }
}
