package com.ohgiraffers.section01.polymorphism.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 인터페이스(interface)에 대해 이해할 수 있다. */
        /* 필기.
        *  인터페이스란?
        *   자바의 클래스와 유사한 형태지만 상수필드(public static final)와
        *   추상method(public abstract)만 가질 수 있는 클래스의 변형체이다.
        *  */

        /* 설명. Interface도 객체를 생성할 순 없다. */
//        InterProduct ip1 = new InterProduct();
//        Product p = new Product();
        InterProduct p = new Product()     // 자동형변환(down-casting) 가능
        p.nonStaticMethod();
    }
}
