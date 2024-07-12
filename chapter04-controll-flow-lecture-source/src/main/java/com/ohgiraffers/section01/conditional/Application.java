package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if aClass = new A_if();

        /* 설명. 단독 if문 흐름 확인용 메서드 호출 */
//        aClass.testSimpleIfStatement();

        /* 설명. 중첩 if문 흐름 확인용 메서드 호출 */
        aClass.testNestedIfStatement();
    }
}
