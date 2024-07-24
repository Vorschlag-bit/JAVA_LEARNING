package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.dto.BookDTO;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {


        /* 수업목표. Object 클래스의 toString(), ... method Overriding의 목적을 이해하고 활용할 수 있다. */
        BookDTO book1 = new BookDTO(1, "perfume", "Partrick", 5000);
        BookDTO book2 = new BookDTO(2, "Deemian", "Hesse", 4000);
        Object book3 = new BookDTO(3, "Traum", "Sigmund", 7000);

        System.out.println(book1.toString());
        System.out.println(book2);    // println이 매개변수로 넘어온 참조자료형의 toString() 자동 실행
        System.out.println(book3.toString());    // 동적 바인딩에 의한 하위 클래스의 toString() 실행
    }
}
