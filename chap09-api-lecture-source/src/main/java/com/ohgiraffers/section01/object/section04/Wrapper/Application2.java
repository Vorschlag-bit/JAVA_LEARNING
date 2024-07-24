package com.ohgiraffers.section01.object.section04.Wrapper;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 문자열을 다양한 기본 자료형으로 바꿀 수 있다. */
        StringTokenizer st = new StringTokenizer("1231 23123");
        byte b = Byte.valueOf("1");
        short s = Short.valueOf("1");
        int i = Integer.valueOf(st.nextToken());
        long l = Long.valueOf("1000");
        float f = Float.valueOf("4.0");
        double d = Double.valueOf("8.00");
        boolean isTrue = Boolean.valueOf("false");
        char c = "avc".charAt(0);     // Character가 제공하지 않아 String의 charAt() 사용한다.
        System.out.println(i);

        // 모든 자료형을 문자형으로 바꾸는 가장 쉬운 방법은 ""을 붙여 문자형으로 자동 형변환 시키는 것이다.
    }
}
