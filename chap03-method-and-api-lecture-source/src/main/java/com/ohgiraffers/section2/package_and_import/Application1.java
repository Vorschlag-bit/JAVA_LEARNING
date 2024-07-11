package com.ohgiraffers.section2.package_and_import;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다. */
        /* 설명.
        *   패키지의 의미
        *     1. 클래스의 소속이 다르다.(다른 소속에선 같은 클래스명을 쓸 수 있다.) (feat. Date 자료형)
        *     2. 원래 클래스의 이름에 일부분이다.
        *     3. 경우에 따라 생략이 가능하나 자동으로 작성되는 내용이다. (같은 패키지일 때는 생략 가능) */
//        Date alt + Enter로 자동 import 가능
        /* 설명. non-static 메소드 호출해 보기(feat. 다른 패키지에 있는) */
        /*  다른 패키지의 non static method를 사용하기 위해선 모든 풀 이름을 밝혀야 한다.
        *   패키지 포함 모든 디렉토리가 클래스의 진짜 이름이다.*/
        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        int plusResult = cal.plusTwoNumbers(100, 20);
        System.out.println("100과 20의 합은 = " + plusResult);

        /* 설명. static method 호출해 보기(feat. 다른 패키지에 있는) */
        int maxResult = com.ohgiraffers.section01.method.Calculator.maxNumbersOf(100, 20);
        System.out.println("두 수 중 더 큰 수는 " + maxResult);
        // 위 과정을 개선하기 위해서 'import'가 나왔다.
    }
}
