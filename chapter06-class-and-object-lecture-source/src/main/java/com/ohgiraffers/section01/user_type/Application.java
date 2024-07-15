package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {

    /* 필기.
    *   객체지향프로그래밍(OOP)란?
    *   OOP(Object Oriented Programming language)
    *   : 추상화, 갭슐화, 상속, 다형성을 적용하여 유지보수성을 고려한 응집력 높고 결합도 낮은
    *   객체 위주의 개발 방식을 적용한 프로그래밍을 말한다. */

    /* 필기.
    *   객체지향의 특징(4대 특징)
    *   - 추상화(Abstraction) (추상화를 제외하면 3대 특징)
    *   - 캡슐화(Encapsulation)
    *   - 상속(Inheritance)
    *   - 다형성(Polymorphism)
    *   위 3가지는 유지보수를 위함이 목적이다.*/

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

        /* 필기.
        *   이렇게 변수들로만 관리할 때 발생할 수 있는 문제점
        *   1. 많은 변수명들을 관리하기 힘들 수 있다.
        *   2. 메서드의 파라미터로 전달할 값이 너무 많아 회원과 관련된 기능을 호출할 때 파라미터가 많아진다.(나쁜 냄새)
        *   3. 메서드의 반환형으로 회원이라는 개념을 반환할 수가 없다.(메서드의 반환형은 하나여야 하기 때문에)
        *  */
        // 리팩토링의 기본적인 이유 중 하나 = 매개변수가 너무 많은 메서드도 수정하자
        // 메모리에 올린 객체 = instance(new를 붙이는 것은 '인스턴스화'이다)
        // 이렇게 회원을 나누면 특정 메서드에 정보를 매개변수로 넘길 때도 일일이 다 넣어야 하며 반환값도 하나만 가능하므로
        // 반환이 사실상 불가능하다. => 새로운 단위 타입이 정의

        Member member = new Member();          // stack에는 Member형의 4바이트 짜리 member라는 객체 할당.
        // 객체의 인스턴스화                      // heap에는 char을 제외한 나머지 4바이트 짜리 칸의 크기가 배정된 구조체가 할당된다.

        /* 설명. 두 명의 회원 객체를 만들어 각각 다른 이름 붙이기 */
        Member member2 = new Member();
        System.out.println(member.name);
        System.out.println(member2.name);

        member.name = "Kane";
        member2.name = "Harry";
        System.out.println(member.name);
        System.out.println(member2.name);

        /* 설명. Kane만 완성 */
        member.age = 32;
        member.gender = 'M';
        member.hobby = new String[]{"football", "golf"};
        member.id = "qwer";
        member.pw = "1q2w3e4r";

        returnmember(member);
        /* 설명. 회원 정보를 하나의 파라미터로 전달하고 하나의 파라미터로 받을 수 있다. */
        /* 설명. 또한 메서드의 반환형으로 한 번에 회원 정보를 반환할 수 있고 반환된 객체에 접근도 가능하다.(주소값을 통한) */
        Member returnVaule  = returnmember(member);
        System.out.println("개명 확인: " + returnVaule.name);
    }

    // 객체를 가리키던 이름을 파라미터에 넣어 얕은 복사를 진행시킨다.
    //member, m, returnValue 모두 하나의 객체를 가리킨다.
    public static Member returnmember(Member m) {
        System.out.println("개명을 시작");
        m.name = "Mbappe";
        return m;
    }
}
