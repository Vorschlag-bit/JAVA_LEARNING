package com.ohgiraffers.section03.abstraction;

public class Car {
    private boolean isOn = false;

    public void startUp() {
        if (this.isOn) { // 시동이 걸려 있다면
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true;             // 시동이 꺼져있다면 켜
            System.out.println("시동을 걸었습니다. 부릉부르르응");
        }
    }
}
