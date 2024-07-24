package com.ohgiraffers.section01.object.section04.Wrapper;

public class Application3 {
    public static void main(String[] args) {

        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)1).toString();
        String i = Integer.valueOf((int)1).toString();
        String l = Long.valueOf(1L).toString();
        String f = Float.valueOf(1f).toString();
        String d = Double.valueOf((double)1).toString();
        String isTrue = Boolean.valueOf(true).toString();
        String ch = Character.valueOf('a').toString();

        // 사실 그냥 이렇게 하는 게 최고다
        /* 설명. 기본자료형을 문자열로 바꿀 때는 간단히 ""만 더해주자 */
        String testf = 3.14f + "";
    }
}
