package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 단항 연산자이자 증감 연산자에 대해 이해하고 활용할 수 있다. */
        int num = 20;
        System.out.println("num = " + num);
        /* 전위 후위는 '연산' 및 '출력'을 기준으로 한다. */

        num++;
        System.out.println("num = " + num);

        ++num;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);

        /* 설명. 증감 연산자를 다른 연산(대입, 산술, 출력 등)과 함께 사용 */
        int firstNum = 20;

        int result1 = firstNum++ + 3;            // 1. 연산(+) 2. 대입 3. 증가 순

        System.out.println("result1 = " + result1);
        System.out.println("firstNum = " + firstNum);
        System.out.println("firstNum = " + firstNum++);
        System.out.println("firstNum = " + ++firstNum);
    }
}
