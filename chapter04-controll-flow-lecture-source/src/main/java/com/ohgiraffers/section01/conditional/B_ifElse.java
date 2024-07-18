package com.ohgiraffers.section01.conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class B_ifElse {
    public void testSimleIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하시오: ");
        int input = sc.nextInt();

//        만약에(홀수라면) {"입력하신 정수는 홀수이다." 출력}
//        아니면 {"입력하신 정수는 짝수이다." 출력}

        if (input % 2 == 0) {
            System.out.println("입력하신 정수는 짝수입니다.");
        } else System.out.println("입력하신 정수는 홀수입니다.");
    }

    public void testNestedifElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 하날 입력하시오.");
        int input = sc.nextInt();


        /* 설명. 정수를 하나 입력받아 양수와 음수를 구분하고 양수일 때만 짝수인지 아닌지 판별한다.(각 상태 모두 출력) */
        if (input >= 0) {
            if (input % 2 == 0) {
                System.out.println("짝수임다");
            } else System.out.println("홀수임다");
        } else {
            System.out.println("음수임다");
        }
    }
}
