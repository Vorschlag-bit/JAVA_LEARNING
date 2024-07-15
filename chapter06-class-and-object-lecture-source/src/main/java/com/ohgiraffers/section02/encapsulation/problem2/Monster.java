package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

    /* 설명. method를 추가함으로 필드가 수정되어도 이 클래스 내부에서만 에러가 발생(단일책임의 원칙) */
    // Applicatoin의 monster1 객체와 Monster 객체는 setInfo라는 method를 통해 상호작용한다.
    String kinds;
    int mp;

    public void setInfo1(String info1) {
        this.kinds = info1;
    }
    public void setInfo2(int info2) {
        this.mp = info2;
    }
}
