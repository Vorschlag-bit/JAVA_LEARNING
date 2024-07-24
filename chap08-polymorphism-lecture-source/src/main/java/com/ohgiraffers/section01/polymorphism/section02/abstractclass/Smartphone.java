package com.ohgiraffers.section01.polymorphism.section02.abstractclass;

public class Smartphone extends Product {

    public Smartphone() {
        /* 설명. 추상클래스라도 생성자를 통해 생성은 허용 */
        super();
    }

    /* 설명. 추상method를 물려받은 자식 클래스(non-abstract)는 '반드시' 오버라이딩해야 한다.(강제성 부여, 규약) */
    @Override
    public void abstarctMethod() {
        System.out.println("Product 클래스로 물려받은 abstractMethod를 오버라이딩한 method 호출");
    }

    /* 설명. 물론 고유 method도 가질 수 있다. */
    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 고유 method 호출!");
    }
}
