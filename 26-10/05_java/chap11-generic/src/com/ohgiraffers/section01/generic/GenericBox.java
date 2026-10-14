package com.ohgiraffers.section01.generic;

public class GenericBox<T> {

    /*
     * [제네릭 클래스]
     * T는 아직 정해지지 않은 타입을 나타내는 타입 매개변수이다.
     *
     * T는 Type을 뜻하는 관례적인 이름이며 반드시 T만 사용해야 하는 것은 아니다.
     * 컬렉션에서는 Element의 E, Key의 K, Value의 V 같은 이름도 자주 사용한다.
     * */

    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
