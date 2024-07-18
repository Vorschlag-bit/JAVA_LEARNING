package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {
    /* 설명. private은 접근 제어자로 이 클래스 내부에서만 사용이 가능하다. */
    /*  정보은닉을 위해 1. 구현 은닉 2. 타입 은닉 3. 필드 은닉 (현재 캡슐화는 3번에 속한다)
    *   메서드에만 호출해서 파라미터만 제공할 뿐 내부 메서드의 기능은 전혀 모르는 상황
    *   사용자는 필드를 어떻게 다루는지를 전혀 모른다. */
    private String name;
    private int hp;

    public void setInfo1(String Info1) {
        this.name = Info1;
    }
    public void setInfo2(int Info2) {
        this.hp = Info2;
    }
}
