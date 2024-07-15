package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다. */

        /* 설명.
        *   회원 정보를 관리하기 위해 회원의 여러 정보(ID, PW, 이름, 나이, 성별
        *   취미)를 취급하여 관리하려고 한다.
        *   이 자료를 취급할 수 있는 방법을 생각해 보자.
        *  */

        /* 목차. 1. 변수를 이용한 회원 데이터 관리 */
        // 우리 프로그램에서 필요한 회원의 정보만 추출
        String id = "user01";
        String pw = "pass01";
        String name = "Jack";
        int age = 22;
        char gender = 'M';
        String[] hobbies = new String[]{"baseball", "reading"};

        System.out.println("id = " + id);
        System.out.println("pw = " + pw);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobbies = " + Arrays.toString(hobbies));

        // 이렇게 회원을 나누면 특정 메서드에 정보를 매개변수로 넘길 때도 일일이 다 넣어야 하며 반환값도 하나만 가능하므로
        // 반환이 사실상 불가능하다. => 새로운 단위 타입이 정의

        Member member = new Member();          // stack에는 Member형의 4바이트 짜리 member라는 객체 할당.
                                               // heap에는 char을 제외한 나머지 4바이트 짜리 칸의 크기가 배정된 구조체가 할당된다.

        System.out.println(member.name);

        member.name = "Kane";
        System.out.println(member.name);
    }
}
