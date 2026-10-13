package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 맛있게 먹고 있습니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다. 어흥~~~");
    }

    public void bite() {
        System.out.println("호랑이가 물어뜯습니다. 왕!!!!!");
    }
}
