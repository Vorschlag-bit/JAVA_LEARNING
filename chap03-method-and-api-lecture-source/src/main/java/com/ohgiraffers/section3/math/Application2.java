package com.ohgiraffers.section3.math;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다.(ver. java.lang.Math 클래스) */

        /* 설명. 1. 0 ~ 9까지의 난수 생성 */
        int rand = (int)(Math.random()*10) + 0;
        System.out.println(rand);
        /* 설명. 2. 1 ~ 10까지의 난수 생성 */
        int rand2 = (int)(Math.random()*10) + 1;
        System.out.println(rand2);
        /* 설명. 3. 10 ~ 15까지의 난수 생성 */
        int rand3 = (int)(Math.random()*6) + 10;
        System.out.println(rand3);
        /* 설명. 4. -128 ~ 127까지의 난수 생성 */
        int rand4 = (int)(Math.random()*256) - 128;
        System.out.println(rand4);
    }
}
