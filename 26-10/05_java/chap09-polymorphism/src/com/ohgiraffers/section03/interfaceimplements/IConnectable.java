package com.ohgiraffers.section03.interfaceimplements;

public interface IConnectable {

    /*
     * [인터페이스]
     * 클래스가 반드시 구현해야 할 기능의 규칙을 정의한다.
     *
     * - interface 키워드로 선언
     * - 직접 객체를 생성할 수 없음
     * - 클래스는 implements로 인터페이스를 구현
     * - 구현 클래스는 추상 메서드를 반드시 오버라이딩 해야함
     * - 인터페이스 타입으로 구현 객체를 참조할 수 있음 (다형성)
     * - 여러 인터페이스를 동시에 구현할 수 있음
     * */

    //    public void connect() {}
    public abstract void connect();

    // 인터페이스의 추상 메서드에는 public abstract가 자동으로 적용된다.
    void disconnect();

    /*
     * 추상 클래스: 공통 속성과 기능을 물려주는 미완성 부모 클래스
     * 인터페이스: 구현 클래스가 지켜야 할 기능의 약속
     * */
}

