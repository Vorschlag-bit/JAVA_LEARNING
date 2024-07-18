package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
    }

    @Override
    public void SoundHorn() {
        System.out.println("Brrrrrrrrrrrrrrrrrrr!");
    }

    @Override
    public void Run() {
        System.out.println("Racing Car is Running!");
    }
}
