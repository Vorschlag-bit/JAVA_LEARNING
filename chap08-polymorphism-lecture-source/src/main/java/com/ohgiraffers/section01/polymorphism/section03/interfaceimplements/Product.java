package com.ohgiraffers.section01.polymorphism.section03.interfaceimplements;

import java.io.Serializable;

public class Product implements InterProduct, Serializable {

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 method 호출됌!");
    }
}
