package com.ohgiraffers.section01.extend;

public class Car {
    // 코드 응집도 굿
    // boolean의 기본값은 false이다.
    private boolean RunningStatus;


    public Car() {
        // Car 클래스 역시 부모를 갖고 있다. 모든 클래스의 공통 부모인 'Object'가 존재한다.
        // Car의 자식 클래스들은 부모 클래스의 기본 생성자는 자동으로 호출된다.
        System.out.println("Car class 기본 Constructor!");
    }

    public void Run(){
        RunningStatus = true;
        System.out.println("자동차가 달리기 시작합니다.");
    }

    public void SoundHorn() {
        if (RunningStatus) {
            System.out.println("Crack! Crack!");
        } else {
            System.out.println("Can't crack if not driving");
        }
    }

    public boolean isRunning() {
        return RunningStatus;
    }

    public void stop() {
        RunningStatus = false;
    }
}
