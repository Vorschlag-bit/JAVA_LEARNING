package com.ohgiraffers.section01.object.section03.stringbuilder;

public class Application02 {
    public static void main(String[] args) {


        /* 수업목표. StringBuilder의 자주 사용되는 method 용법 및 원리를 이해할 수 있다. */
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());        // 16byte의 용량(처음에는 적은 용량을 시작한다)

        /* 설명. StringBuilder는 가변객체(mutable object)롷서 내부적으로 용량이 증가하는 방식을 위한다. */
        for (int i = 0; i < 50; i++) {
            sb.append(i);

            /* 설명. 용량을 초과할 거 같으면 (*2 + 2)만큼 증가한다.(주소값 변동 x) */
            System.out.println("sb: " + sb);
            System.out.println("capacity: " + sb.capacity());
            System.out.println("identityHashCode: " + System.identityHashCode(sb));
        }

//        StringBuilder sb2 = new StringBuilder("javamariadb");
        StringBuffer sb2 = new StringBuffer("javamariadb");
        System.out.println(sb2.capacity());      // 믄지얄 크기 + 16byte가 기본값;

        /* 필기.
        *  delete():
        * deletcharAt()
        * */
        System.out.println("delete() " + sb2.delete(2,5));
        System.out.println("deleteCharAt(): " + sb.deleteCharAt(0));

        /* 필기.
        *   insert(): 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
        *  */
        System.out.println("insert(): " +  sb.insert(1, "vao"));
        System.out.println("insert(): " +  sb.insert(8, "j"));
        System.out.println("insert(): " +  sb.insert(sb2.length(), "jdbc"));

        /* 필기.
        *  reverse(): 문자열 인덱스 순번을 역순으로 재배열한다.
        * */
        System.out.println("reverse(): " + sb.reverse());
    }
}
