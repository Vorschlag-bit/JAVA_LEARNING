package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public static void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        boolean flag = true;
        int point = 0;

        switch (grade) {
            case 'G': point += 10;
            case 'S': point += 10;
            case 'B': point += 10; break;
            default:
                flag = false;
                System.out.println("Invalid grade");
        }

        /* 설명. G/S/B 중에 하나를 입력하면 해당 등급 point를 보여주고 그렇지 않으면 회원가입 유도 */
        if(flag) {
            System.out.println("You have entered a valid grade: " + grade + ", your point is " +point);
        }
        else System.out.println("You have entered an invalid grade");
    }
}
