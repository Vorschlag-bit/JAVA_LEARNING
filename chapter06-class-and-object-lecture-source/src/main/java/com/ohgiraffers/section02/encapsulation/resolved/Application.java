package com.ohgiraffers.section02.encapsulation.resolved;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 접근제어자와 캡슐화에 대해 이해하고 직접 필드 접근을 막는 이유를 이해할 수 있다. */
        Monster monster1 = new Monster();
        // 필드를 캡슐화
        //private 접근 제어자로 인해 직접 접근 불가능하다 (Encapsulation)
//        monster1.name = "Dracula";
//        monster1.hp = 20;

        /* 설명. field에 직접 접근이 안 되므로, method를 통해서만 접근 가능하다 */
        monster1.setInfo1("Dracula");
        monster1.setInfo2(2000);


        /* 필기.
        *   캡슐화(Encapsulation)이란?
        *   캡슐화는 유지보수를 증가시키기 위해 필드의 직접 접근을 제한하고
        *   public method를 이용해서 간접적으로(우회해서) 접근하여 사용할 수 있도록 하는 기술이다.
        *   class 작성 시 특별한 목적이 없다면 캡슐화를 적용하는 게 원칙이다. */
    }
}
