package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. */

        /* 설명. monster1 생성 */
        Monster monster1 = new Monster();    // 객체 생성
        monster1.name = "드라쿨라";           // 참조연산자(.)을 통해 접근해서 값 대입
        monster1.hp = 200;

        System.out.println("monster1's hp = " + monster1.hp);         // 참조연산자를 이용해 값 추출
        System.out.println("monster1's name = " + monster1.name);

        /* 설명. monster2 생성(hp에 음수를 넣음(원치 않은 데이터)으로 인한 문제 발생 */
        // 직접 접근하면 유효성 검사를 진행할 수가 없다.
        Monster monster2 = new Monster();
        monster2.name = "FrankenStein";
        monster2.hp = -200;

        System.out.println("monster2's hp = " + monster2.hp);
        System.out.println("monster2's name = " + monster2.name);

        /* 설명. monster3 생성 */
        Monster monster3 = new Monster();
        monster3.name = "Mummy";

        /* 설명. 이 때 setHp 메서드 내부의 this == monster3 */
        monster3.setHp(- 200);
        monster3.setHp(100);
        monster3.setHp(150);

        System.out.println(",monster3의 이름: " +monster3.name);
    }
}
