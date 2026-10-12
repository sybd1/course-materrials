package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    // 이른 초기화

    // 1. 클래스가 로딩되는 즉시 인스턴스를 딱 하나 미리 만들어 보관
    private static EagerSingleton eager = new EagerSingleton();

    // 2. 외부에서 new로 만들지 못하게 생성자를 private로 잠근다.
    private EagerSingleton() {}

    // 3. 유일한 객체를 건네주는 통로
    public static EagerSingleton getInstance() {
        return eager;
    }
}
