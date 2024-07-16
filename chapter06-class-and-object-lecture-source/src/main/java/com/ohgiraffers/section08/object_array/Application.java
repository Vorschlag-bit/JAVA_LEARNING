package com.ohgiraffers.section08.object_array;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrai", 300);
        Car car2 = new Car("Lamborghini", 510);
        Car car3 = new Car("Rollsroyce", 250);
        Car car4 = new Car("Bugatti", 400);
        Car car5 = new Car("Porter", 500);

        // 같은 코드의 반복... 같은 타입 객체를 같은 코드로 실행하고 싶다 = 배열
        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] cars = new Car[] { car1, car2, car3, car4, car5 };
        for (Car car : cars) {
            car.driveMaxSpeed();
        }
    }
}
