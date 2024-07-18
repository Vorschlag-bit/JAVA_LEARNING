package com.ohgiraffers.section04.constructor.dto;

import java.util.Date;
/* 필기.
*  Java Bean이란?
*  JSP에서 사용되는 표준 액션 태그로 접근할 수 있게 만든 자바 클래스 형태이다.
*  자바 코드를 모르는 웹 퍼블리셔도 자바 코드를 사용할 수 있게 태그 형식으로 지원하는 문법을
*  의미하는데, 그 때 사용할 수 있도록 규칙을 지정해 놓은 java 클래스를 자바빈(javabean)이라고 부른다.
*  지금은 특정 목적 및 프레임워크를 위해 클래스를 작성하는 규칙이라고 보면 된다. */

/* 필기.
*  자바빈 작성 규칙
*  1. 자바빈은 특정 패키지에 속해 있어야 함(default package 사용 금지)
*  2. 필드의 접근제어자는 private으로 선언해야 함(캡슐화)
*  3. 기본 생성자가 명시적으로 존재해야 한다.(매개변수 있는 생성자는 선택사항)
*  4. 모든 필드에 접근 가능한 setter와 geeter가 public으로 작성되어 있어야 함
*  5. 직렬화(Serializable 구현)를 고려해야 한다.(선택사항) */

public class UserDTO {

    /* 필기. 1. 필드(멤버변수) */
    private String id;
    private String pw;
    private String name;
    private java.util.Date enrollDate;

    /* 필기. 2. 생성자(기본생성자 필수로 명시적 작성)! */
    public UserDTO() {
    }

    public UserDTO(String id, String pw, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    // private로 멤버변수를 설정했기 때문에 접근하기 위한 클래스 메서드가 반드시 필요하다.
    /* 필기. 설정자(setter)와 접근자(getter) */
    public String getId() {
        return this.id;  // 내가 반환받고 싶은 객체의 아이디를 내놔라
    }
    public void setId(String id) {
        this.id = id;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPw() {
        return pw;
    }

    /* 필기. 4. 모든 멤버 변수를 하나의 String 문자열로 반환하는 toString()  */
    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
