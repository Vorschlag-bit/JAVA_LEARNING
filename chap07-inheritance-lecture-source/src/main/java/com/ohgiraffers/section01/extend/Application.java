package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 상속에 대해 이해할 수 있다. */
        Car car = new Car();

        car.SoundHorn();
        car.Run();
        car.SoundHorn();
        car.stop();
        car.SoundHorn();

        // method 상속 확인(extend 없으면 오류)
        FireCar fireCar = new FireCar();
        fireCar.SoundHorn();
        fireCar.Run();
        fireCar.SoundHorn();
        fireCar.stop();
        fireCar.SoundHorn();
        // firecar class만의 고유 method
        fireCar.sprayWater();

        RacingCar racingCar = new RacingCar();
        racingCar.SoundHorn();
        racingCar.Run();
        racingCar.SoundHorn();
        racingCar.stop();
        racingCar.SoundHorn();
    }
}
