package com.ohgiraffers.section01.object.section06.time;

import java.time.LocalDateTime;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지 클래스를 활용한 덧셈,뺄샘 및, 불변 특성을 이해할 수 있다. */
        /* 설명. 불변이므로 새로운 객체가 생성되어 주소값이 바뀐다. */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("address = " + System.identityHashCode(localDateTime));

        LocalDateTime localDateTime2 = localDateTime.plusMinutes(30);
        System.out.println("After 30Min: " + localDateTime2);
        System.out.println("address = " + System.identityHashCode(localDateTime2));

        LocalDateTime localDateTime3 = localDateTime.minusHours(3);
        System.out.println("Before 3HR = " + localDateTime3);
        System.out.println("address = " + System.identityHashCode(localDateTime3));
    }
}
