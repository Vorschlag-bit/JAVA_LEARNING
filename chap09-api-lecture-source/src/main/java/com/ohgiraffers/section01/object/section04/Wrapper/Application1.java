package com.ohgiraffers.section01.object.section04.Wrapper;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */
        int intValue = 20;

        /* 설명. Primitive type을 Wrapper class type으로 변환할 수 있다.(boxing) */
        Integer boxingint = (Integer) 20;       // boxing
        Integer boxingin2 = Integer.valueOf(boxingint);

        /* 설명. Wrapper class type을 Primitive type으로 변환할 수 있다. */
        int unboxingint = boxingint.intValue();

        /* 설명. Primitive type과 Wrapper class는 자동으로 boxing 및 unboxing이 일어난다. */
        Integer autoBoxingInt = intValue;    // auto-boxing
        int autoUnboxingInt = autoBoxingInt;      // auto-unboxing

        anythingMethod(10);

        /* 설명. Wrapper class 주소값 비교! */
        Integer integerTest = 127;
        Integer integerTest2 = 127;
        System.out.println("== 비교: " + (integerTest == integerTest2));     // 동일(주소값)비교
        System.out.println(".equals() 비교: " + (integerTest.equals(integerTest2)));    // 동등(값)비교
        System.out.println("integerTest address:" + System.identityHashCode(integerTest));
        System.out.println("integerTest2 address:" + System.identityHashCode(integerTest2));
    }

    /* 설명. parameter가 Object인 method라 어떤 자료형이라도 다 받을 수 있다. */
    public static void anythingMethod(Object obj) {

        /* 설명. 10 -> Integer로 auto-boxing -> Object(다형성)  */
        /* 설명. 출력 -> Object의 toString()에서(정적바인딩) Integer의 toString()(동적바인딩)이 실행됌 */
        System.out.println("obj is " + obj.toString());
    }
}
