package com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {

        A_for aClass = new A_for();

        /* 설명. 단독 for문을 흐름 확인용 메서드 호출 */
//        aClass.testSimpleForStatement();

//        aClass.testForExample();

        B_nestedFor bClass = new B_nestedFor();
//        bClass.printGugudanFromTwoToNine();
//        bClass.prinStars();
        bClass.placeStars();
    }
}
