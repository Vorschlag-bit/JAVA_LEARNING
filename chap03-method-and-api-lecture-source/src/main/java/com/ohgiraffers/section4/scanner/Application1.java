package com.ohgiraffers.section4.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력받기  */
        Scanner sc = new Scanner(System.in);

        /* 설명. Buffer는 우리가 키보드로 입력한 값을 임시적으로 보관하는 공간 */

        /* 목차. 1. 문자열 입력 받기 */

        /* 설명. next()는 공백 또는 개행문자를 취급하지 않고 그 전까지만 버퍼에서 가져옴 */
//        System.out.println("이름을 입력하세요: ");
//        String lastName = sc.next();             // "가 나다"를 입력하면 "유"
//        String firstName = sc.next();            // "가 나다"를 입력하면 "나다"
//        System.out.println("name: " + firstName + " " + lastName);
//
//        /* 설명. nextLine()이 아닌 Scanner 메소드를 활용하다 nextLine()을 쓰게되면 고려할 것 */
//        sc.nextLine();         // 버퍼에 남아 있는 개행 처리용구문(엔터 제거)
//
//        /* 설명. nextLine()은 공백 또는 개행문자까지 취급해 버퍼에서 모두 가져옴 */
//        System.out.println("이름을 입력하세요: ");
//        String name2 = sc.nextLine();
//        System.out.println("name: " + name2);
//
//        /* 목차. 2. 정수형 입력 받기 */
//        System.out.print("나이를 입력하세요: ");
//        int age = sc.nextInt();
//        System.out.println("age: " + age);
//
//        /* 목차. 3. 실수형 입력 받기 */
//        System.out.print("키를 입력하세요: ");
//        double height = sc.nextDouble();
//        System.out.println("height: " + height);
//
//        /* 목차. 4. 논리형 입력 받기 */
//        System.out.println("참과 거짓 중 한 가지를 true or false로 입력하세요: ");
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue: " + isTrue);

        /* 목차. 5. 문자형 입력 받기 */
        System.out.println("아무 문자 하나만 입력하세요:");
        char answer = sc.next().charAt(0);
        System.out.println("입력한 문자: " + answer);
    }
}

