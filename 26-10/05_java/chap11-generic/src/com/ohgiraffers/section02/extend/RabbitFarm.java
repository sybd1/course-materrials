package com.ohgiraffers.section02.extend;

/*
* <T extends Rabbit>: Rabbit 또는 Rabbit의 자식 타입만 오도록 제한
* */
public class RabbitFarm<T extends Rabbit> {

    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
