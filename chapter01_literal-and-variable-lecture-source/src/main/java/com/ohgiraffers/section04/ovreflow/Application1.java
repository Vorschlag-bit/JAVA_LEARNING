package com.ohgiraffers.section04.ovreflow;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표 . overflow에 대해서 이해할 수 있다. */
        /* 필기 .
        *   자료형 별 값의 최대 범위를 벗어나는 경우
        *   발생한 carry를 버림처리하고 부호 비트를 반전시켜 순환한다.
        * */
        /* 설명. overflow */
        byte num1 = -128;
        System.out.println("hihj"+ --num1);

        num1++;           // 기존의 num1 변수에 있던 값에 1을 더해 다시 대입한다.
                          // num1 = num1 + 1;

        System.out.println("num1 = " + num1);
        num1++;
        System.out.println("num1 = " + num1);
        num1++;
        System.out.println("num1 = " + num1);    // 순환한다

        /* 설명. underflow */
        num1--;
        System.out.println("num1 = " + num1);
        num1--;
        System.out.println("num1 = " + num1);
        num1--;
        System.out.println("num1 = " + num1);
    }
}
