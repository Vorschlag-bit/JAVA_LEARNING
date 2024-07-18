package com.ohgiraffers.section01.object.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {

        /* 설명. String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */
//        StringBuilder sb = "java";  => 리터럴 풀을 사용 못한다.
        StringBuilder sb = new StringBuilder("java");

        /* 설명. String하고 StringBuilder로 수정 시 객체 주소값 변화 살펴보기 */
        String str = "java";
        StringBuilder testsb = new StringBuilder("kotlin");

        for (int i = 0; i < 9; i++) {
            str = str + i;
            testsb.append(i);      // append method로 문자열을 이어 붙인다.

            System.out.println("String: " + System.identityHashCode(str));
            System.out.println("StringBuilder: " + System.identityHashCode(testsb));
        }

        System.out.println("String result: " + str);
        System.out.println("StringBuilder result: " + testsb);  // StringBuilder도 toString이 Override되서 그냥 이렇게 써도 된다.
    }
}
