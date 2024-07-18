package com.ohgiraffers.section01.polymorphism.section02.abstractclass;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 추상클래스와 추상메소드에 대해 이해할 수 있다. */
        /* 필기.
        *  추상클래스(abstract-class)
        *  추상method를 0개 이상 포함하는 클래스를 추상클래스라고 함.
        *  쉽게 말해 '불완전한' 클래스라고 생각하자.
        *  불완전한 클래스는 별도로 생성자를 통해 객체를 생성하지 못한다.
        *  (단, 자식 클래스의 객체가 생성될 때는 내부적으로 생성될 수 있다.)
        *
        * 필기.(abstract-method)
        *  method의 head부만 있고 body부가 없는 method를 abstract method라고 한다.
        *  쉽게 말해 불완전한 method이다.
        *  ex) public abstract void holycow(); */
//        Product product = new Product();

        /* 설명. abstract method를 구현한 온전한 자식 클래스는 인스턴스를 생성할 수 있다. */
        Smartphone iphone = new Smartphone();  // 자식 객체 생성한다는 것은 부모 객체도 생성해야 한다는 의미이다.
        Product galaxy = new Smartphone();     // 추상클래스도 다형성이 적용된다(타입은 물려준다)
        iphone.abstarctMethod();
        galaxy.abstarctMethod();               // 동적 바인딩에 의한 자식 클래스의 오버라이딩 method 실행
    }
}
