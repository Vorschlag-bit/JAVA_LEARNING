package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다. 깡총S");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 운다. 끼익! 끼익!");
    }

    public void jump() {
        System.out.println("Jump! Jump!");
    }
}
