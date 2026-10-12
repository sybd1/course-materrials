package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    // 게으른 초기화

    // 처음에는 비워둔다. ( null )
    private static LazySingleton lazy;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        // 처음 호출될 때만 만들고, 이후에는 이미 만들어진 것을 반환
        if (lazy == null) {
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
