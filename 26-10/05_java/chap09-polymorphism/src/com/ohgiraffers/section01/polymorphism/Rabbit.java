package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{

    @Override
    public void eat() {
        System.out.println("토끼가 당근을 먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 깡총깡총 뛰어갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 뀨~ 귀엽게 울음소리를 냅니다.");
    }

    public void jump() {
        System.out.println("토끼가 점프를 뜁니다~!!");
    }
}
