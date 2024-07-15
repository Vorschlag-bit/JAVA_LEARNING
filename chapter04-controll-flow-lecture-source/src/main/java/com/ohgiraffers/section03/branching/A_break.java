package com.ohgiraffers.section03.branching;

public class A_break {
    public void testSimpleBreakStatement(){
        int sum = 0;
        int i = 1;
        while(true) {
            sum += i;
            System.out.println("sum = " + sum);

            if(i == 10) break;           // 반복문 안에서 조건문 사용 가능, 가장 가까운 반복문을 빠져 나간다.

            i++;
        }
    }
}
