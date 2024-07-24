package com.ohgiraffers.section05.overloading.parameter;

import java.util.Arrays;

public class ParameterTest {
    // 아래 Parameter는 Stack에 쌓이다가 method가 끝나면 그냥 사라진다.
    public void TestPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("Parameter로 전달받은 값: " + num);
    }

    // 배열을 넘기는 것이 아닌 주소값을 넘기는 것이다.
    public void TestPrimitiveTypeArrayParameter(int[] iArr) {
        iArr[0] = 1000;
        System.out.println("Parameter로 전달받은 값: " + iArr[0]);
    }

    public void testClassTypeParameter(Rectangle Holycow) {
        Holycow.calculateArea();
        Holycow.calculateRound();
    }

    // 내가 제공하는 parameter 개수와 상관없이 ...은 그걸 모두 받아 배열로 만든다
    // 그 증거로 toString을 사용하지 않고 그냥 출력하면 주소값이 출력된다
    /* 가변인자를 쓰지 않는 이유: 설계되지 않은 변수를 허용하지 않는 게 Java의 방식 */
    public void testVariableLengthArrayParameter(String... etc) {
        System.out.println("str = " + Arrays.toString(etc));
    }
}


