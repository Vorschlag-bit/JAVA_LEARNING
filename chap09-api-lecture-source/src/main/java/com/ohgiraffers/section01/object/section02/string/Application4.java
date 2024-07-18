package com.ohgiraffers.section01.object.section02.string;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. Escape 문자에 대해 이해하고 적용할 수 있다. */
        /* 필기.
         *  Escape 문자
         *  문자열 내에서 사용하는 특수기능을 위한 문이다.
         *
         *  필기.
         *  \n: 개행
         *  \t: tap
         *  \': 작은 따옴표
         *  \": 큰 따옴표
         *  \\: 역슬래시 표기
         *  */

        System.out.println("안녕하세요.\nI'm Mel");
        System.out.println("안녕하세요.\t I'm Mel");     // 탭의 정확한 의미는 화면이 격자무늬라고 가정했을 때, 다음 격자로 넘어간다는 의미이다.

        System.out.println("안녕하세요. I'm 'Mel'");
        System.out.println('\'');     // 작은 따롬표 하나만 출력하고 싶을 때 구분할 수 없어서 붙여야 한다.
        System.out.println("안녕하세요. I'm \"Mel\"");

        System.out.println("역슬래쉬(\\)입니다.");      // 역슬래시 자체가 문법 기능이 있어서 두 개를 붙여야 한다.

        /* 설명. Escape 문자 외에도 printf 관련 문법도 있으니 참고하자. */
        /* 설명. %.2f: 소수점 둘째자리까지 실수를 표현하며 셋째자리에서 반올림, %d: 정수형 표현 */
        System.out.printf("PI is %.2f. but we say it's %d: ", 3.14159265358979, 3);
    }
}
