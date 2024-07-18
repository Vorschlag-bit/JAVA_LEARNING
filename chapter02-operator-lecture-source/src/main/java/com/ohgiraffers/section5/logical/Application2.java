package com.ohgiraffers.section5.logical;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 논리 연산자 활용 */
        /* 목차. 1. 1부터 100 사이 값 확인 */
        int num1 = 55;
        int num2 = 101;
//        System.out.println((num1 >= num2) && (num1 <= 100));
//        System.out.println((num2 >= num1) && (num2 <= 100));

        /* 목차. 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        char ch2 = 'g';

        System.out.println("A의 유니 코드는? " + (int) 'A');
        System.out.println("z의 유니 코드는? " + (int) 'Z');
        System.out.println(ch1 >= 65 && ch1 <= 'Z');
        System.out.println(ch2 >= 65 && ch2 <= 'Z');
//        Systoem.out.println(ch2 >= ch2 <= 'Z');

        /* 목차. 3. 대소문자 상관없이 영문자 'y' 확인 */
        char ch3 = 'Y';
        char ch4 = 'Y';
//        System.out.println(ch3 == 'y'  || ch4 == 'Y');
//        System.out.println(ch3 == 'y'  || ch4 == 'Y');
    }
}
