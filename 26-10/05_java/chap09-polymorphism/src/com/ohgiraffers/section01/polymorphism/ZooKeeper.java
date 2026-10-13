package com.ohgiraffers.section01.polymorphism;

public class ZooKeeper {

    // 다형성 적용 전
    public void feed(Rabbit rabbit) {
        System.out.println("토끼에게");
        rabbit.eat();
    }

    public void feed(Tiger tiger) {
        System.out.println("호랑이에게");
        tiger.eat();
    }

    // 매개변수에 다형성 적용
    public void feed(Animal animal) {
        System.out.println("다형성 적용");
        animal.eat();
    }
}
