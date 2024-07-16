package com.ohgiraffers.section05.overloading.parameter;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        System.out.println("직사각형의 넓이는 " + this.width * this.height);
    }

    public void calculateRound() {
        System.out.println("직사격형의 둘레는 " + (this.width + this.height) * 2);
    }
}
