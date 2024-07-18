package com.ohgiraffers.section2;
import com.ohgiraffers.section01.method.Calculator;
public class Application2 {
    public static void main(String[] args) {
        Calculator cal =new Calculator();
        /* 수업목표. import에 대해 이해할 수 있다. */
        /* 설명. 다른 패키지의 클래스명(full 클래스명)을 줄여쓰고자 할 때 쓸 수 있다. */
        /*  길게 쓴 걸 줄여쓰자. */
        
        int result = cal.plusTwoNumbers(80, 22);
        System.out.println("result = " + result);
        
        int result2 = cal.plusTwoNumbers(40, 90);
        System.out.println("result2 = " + result2);
    }
}
