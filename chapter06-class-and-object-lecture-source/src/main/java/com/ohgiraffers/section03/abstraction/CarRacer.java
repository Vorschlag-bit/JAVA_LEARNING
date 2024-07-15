package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car mycar = new Car();

    public void startUp() {
        this.mycar.startUp();      // 객체화된 mycar를 호출하겠다.
    }
}
