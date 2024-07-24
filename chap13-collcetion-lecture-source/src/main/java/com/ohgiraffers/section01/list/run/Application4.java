package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
        /* 필기.
        *  Stack이란?
        *   후임선출(LIFO) or 선입후출(FILO)의 자료구조로 push(), pop(), peek() 등의 method를
        *   활용하여 자료를 처리할 수 있다. */

        Stack<Integer> Istack = new Stack<>();

        /* 설명. Stack 인스턴스 생성 후 데이터 추가 */
        Istack.push(1);
        Istack.push(2);
        Istack.push(3);
        Istack.push(4);
        Istack.push(5);
        // toString() Override가 잘 되어 있는 모습
        System.out.println(Istack);

        System.out.println(Istack.peek());

        System.out.println("search(): " + Istack.search(2));

        while(!Istack.isEmpty()) {
            System.out.println("pop(): " + Istack.pop());
        }

        System.out.println(Istack);
    }
}
