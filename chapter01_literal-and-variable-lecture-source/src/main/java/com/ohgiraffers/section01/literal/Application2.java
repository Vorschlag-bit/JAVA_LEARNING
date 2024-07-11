package com.ohgiraffers.section01.literal;

import java.sql.SQLOutput;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 */
        System.out.println("============= 정수와 정수의 연산 ===============");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("============= 실수와 실수의 연산 ================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);         // 소수점 이하를 보고 싶으면 실수를 활용한 나눗셈을 하자.
        System.out.println(1.23 % 1.0);          // 실수는 정확하지 않고 근사한 값이다.
        System.out.println("============= 정수와 실수의 연산 ================");
        System.out.println(123 / 0.5);     //실수값이 하나라도 있으면 실수가 나온다 = 실수의 우선순위가 더 높다
        System.out.println("============= 문자와 정수의 연산 ================");
        System.out.println('a' + 1);     // 97 + 1
        System.out.println('a' % 2);
        System.out.println("============= 문자열과 문자열의 연산 ================");
        /* 문자열끼리의 연산은 '+'만 가능하며 이어붙이기의 효과가 있다 */
        System.out.println("피곤하고" + "졸리네");
        System.out.println("============= 문자뎔와 다른 형태의 값 연산 ================");
        /* 문자열이 아닌데도 이어붙여진다 = 문자열 뒤에 붙여진 값은 다 문자열로 인식, 앞에다 쓰면 인식 못하고 숫자로 연산 */
        System.out.println("hello" + 123);
        System.out.println("hello" + true);
        /*앞에 붙인 다른 값은 그 값으로 연산되고 마지막에 문자열로 바뀌어 이어 붙이기로 문자열에 붙는다*/
        System.out.println(123 + 1 + "hello" + 12.3 + 2);
        System.out.println(123 + 1 + "hello" + (12.3 + 2));
        System.out.println("============= 논리값과 문자열 형태의 연산 ================");
        System.out.println(true + "문자열"); //맨 마지막에 true를 문자열로 바꾼다


    }
}