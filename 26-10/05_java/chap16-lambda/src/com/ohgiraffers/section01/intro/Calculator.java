package com.ohgiraffers.section01.intro;

/* 함수형 인터페이스: 추상 메서드가 하나인 인터페이스 */
@FunctionalInterface
public interface Calculator {

    int operate(int a, int b);
}
