package com.ohgiraffers.section02.extend.vo;

// Rabbit 및 Rabbit의 하위 객체만이 T에 들어갈 수 있다!
public class RabbitFarm<T extends Rabbit> {
    private T animal;

    public RabbitFarm() {
    }

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
