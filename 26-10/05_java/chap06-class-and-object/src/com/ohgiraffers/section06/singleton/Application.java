package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {

//        EagerSingleton eager1 = new EagerSingleton(); // 생성자가 private라 접근 불가
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println(eager1 == eager2);

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println(lazy1 == lazy2);
    }
}
