package com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {

        String[] SArr = {"apple", "banana", "grape", "oragne"};

        /* 설명. 1. 단순 for문 사용 */
        for (int i = 0; i < SArr.length; i++) {
            System.out.println(SArr[i]);
        }

        /* 설명. 2. Arryas.toString() 사용 */
        System.out.println();

        /* 설명. 3. for-each문 사용(향상된 for문) */
        for(String str: SArr) {
            System.out.println(str);
        }
    }
}
