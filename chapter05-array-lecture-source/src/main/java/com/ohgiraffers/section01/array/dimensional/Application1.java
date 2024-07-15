package com.ohgiraffers.section01.array.dimensional;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 다차원 배열의 구조를 이해하고 사용할 수 있다. */
        /* 설명.  */

        int[][] iArr1;
        int[] iArr2[];
        int iArr3[][];   //

        iArr1 = new int[3][2];         // 정번 배열을 위한 선언(관리하는 1차원 배열의 길이가 동일)
        iArr2 = new int[3][];          // 가변 배열을 위한 선언(관리하는 1차원 배열의 길이가 다를 시)
//      iArr3 = new int[][];           // 컴파일 에러 발생

        int num = 0;
        for (int i = 0; i < iArr1.length; i++) {
            System.out.println("iArr[i] : " + iArr1[i]);           // 2차원의 1차원 배열을 관리하는 주소값이 들어가 있다.
            for (int j = 0; j < iArr1[i].length; j++) {            // iArr[0] <- 값이 들어가는 것이 아닌 배열의 주소값(기본 값 = null), iArr[0][0] = iArr 0번째 줄 첫번째 값
                iArr1[i][j] = num++;                               // 선택된 1차원 배열을 다루는 for 문
            }
            System.out.println(Arrays.toString(iArr1[i]));         // 2차원 배열에 속한 1차원 배열 한 번에 보기
        }
        /* 설명. Arrays.toString()은 1차원 배열만 확인이 가능하다 */
        System.out.println("2차원 배열도 한 번에 확인? " + Arrays.toString(iArr1));
    }
}
