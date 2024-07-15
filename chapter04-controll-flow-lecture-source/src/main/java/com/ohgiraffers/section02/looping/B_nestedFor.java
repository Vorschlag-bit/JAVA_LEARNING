package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + " 단 곱셈");
            Gugudan(i);
        }
    }

    private static void Gugudan(int i) {
        for (int j = 1; j <= 9; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }

    /* 설명.
    *   아래와 같은 별모양이 나오도록 작성해 보자.
    *   정수를 입력하시오: 5
    *   *
    *   * *
    *   * * *
    *   * * * *
    *   * * * * * */


    /* 설명. int 값을 주면 그만큼 옆으로 *을 찍는 기능의 메서드 */
    public void prinStars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하십시오");
        int input = sc.nextInt();

        for(int i = 0; i < input; i++) {
            System.out.println();
            for (int j = 0; j < input; j++) {
                if (i >= j) System.out.print("* ");
            }
        }
    }

    /* 이번엔 이렇게
    *  5
    * 45
    * 345
    * 2345
    * 12345*/
    public void placeStars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("별 입력:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = n; j >= 1; j--) {
                if(i <= j) System.out.print("* ");
                else System.out.print(" ");
            }
        }
    }
}
