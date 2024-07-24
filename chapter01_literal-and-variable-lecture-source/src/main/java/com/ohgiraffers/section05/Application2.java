package com.ohgiraffers.section05;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
        /* 필기.
        *   강제형변환
        *   바꾸려는 자료형으로 캐스트 연산자(자료형)를 이용하여 형변환
        *  */

        long lNUM = 8000000000L;
        int iNUM = (int) lNUM;
        System.out.println("iNUM = " + iNUM);

        float avg = 31.264f;
        int Floornum = (int) avg;
        System.out.println("Floornum = " + Floornum);
    }
}
