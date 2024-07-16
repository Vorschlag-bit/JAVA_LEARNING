package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {

//        psudo code: 반복(0부터 9까지) { 1부터 10까지 출력 }

        for(int i = 0; i < 10; i++) {
            System.out.println("i = " + i + 1);
        }
    }
    public void testForExample() {
        
        /* 설명. 변수들에 담긴 값들에 각각 2를 곱하고 1을 더해 sum에 누적 */
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
            
        int sum = 0;
        
        
        sum += 2 * num1 + 1;
        sum += 2 * num2 + 1;
        sum += 2 * num3 + 1;
        sum += 2 * num4 + 1;
        sum += 2 * num5 + 1;
        System.out.println("sum = " + sum);

        /* 설명. for문을 통해 개선 */
        int forsum = 0;

        for (int i = 0; i < 5; i++) {
            forsum += (i + 1) * 2 + 1;
        }

        System.out.println("forsum = " + forsum);
    }
    public void testForExample2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Limit: ");
        int limit = sc.nextInt();

        int sum = 0;

        for (int i = 2; i < limit; i += 2) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
