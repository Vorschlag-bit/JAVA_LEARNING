package com.ohgiraffers.section05.typecasting;

public class Appliaction1 {
    public static void main(String[] args) {

        /* 수업목표. 자동 형변환(Implicit Coercion) 규칙에 대해 이해할 수 있다 */
        byte bNum = 1;

        short sNum = bNum;
        int iNum = sNum;

        /* 설명.연산 시에도 자동으로 큰 자료형에 맞춰서 낮은 자료형이 자동형변환 된다.  */
        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);

        /* 설명. 문자형 */
        int ch1 = 'A';
        System.out.println("ch1 = " + ch1);

        /* 설명. int 형에서 char형에 담기는 건 작은 범위로 대입되지만 가능하다.(예외) */
        /* 필기. 해당 범위는 아스키 코드가 지원하는 수까지만 담긴다.(65 = 'A') */
        char ch2 = 65;
    }
}
