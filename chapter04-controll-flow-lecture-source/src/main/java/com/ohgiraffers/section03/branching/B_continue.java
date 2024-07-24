package com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class B_continue {
    public void testSimpleContinueStatement() {
        /* 설명. 1부터 100까지의 4와 5의 공배수만 출력 */
        for (int i = 1; i <= 100; i++) {
            /* 설명. continue를 활용한 구문으로 변환 */
            if(!(i % 5 == 0 && i % 4 == 0)) continue;      //contune이후 반복 구간은 건너뛴다.
            if(i % 4 == 0 && i % 5 == 0) {                 //와 5의 공배수가 아니면 continue
                System.out.println(i + " is a continue statement");
            }
        }


    }
}
