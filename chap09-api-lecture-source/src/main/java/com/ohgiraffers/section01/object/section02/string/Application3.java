package com.ohgiraffers.section01.object.section02.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 분리에 대해 이해하고 적용할 수 있따. */
        /* 필기.
        *  문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
        *  1. split(): 정규표현식을 이용하여 비정형화된 문자열을 분리한다.
        *              (String을 파싱하여 String[]로 만들어주고 []를 활용하여 구분자들을 넣을 수 있다.)
        *  2. StringTokenizer: 문자열의 모든 문자들으 구분자를 활용하여 문자열이 분리된다. */

        /* 설명. 1. split() 사용 */
        String emp1 = "100/홀길동/서울/영업부";
        String emp2 = "200/유관순//서울/총무부";
        String emp3 = "300/이순신/서울/영업부/";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");
        System.out.println(Arrays.toString(empArr1));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));
        System.out.println();

        /* 설명. StringTokenizer 활용 */
        // 얘는 성성자라 () 안 붙인다.
        String colors = "red, yellow, green, purple, blue";
        StringTokenizer st = new StringTokenizer(colors, ", ");
        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());

            // 추출한 토큰 재활용하기
            String token = st.nextToken();
            System.out.println(token);
            System.out.println(token);
        }

    }
}
