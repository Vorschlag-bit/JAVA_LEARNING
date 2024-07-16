package com.ohgiraffers.section05.overloading.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 메서드의 parameter에 대해 이해하고 사용할 수 있다. */

        /* 필기.
        *  parameter로 사용 가능한 자료형
        *  1. 기본 자료형(Primitive type)
        *  2. 기본 자료형 배열
        *  3. 클래스 자료형(Reference type)
        *  4. 글래스 자료형 배열(객체 배열이나 다음 챕터에서 다룸)
        *  5. 가변인자
        *  */

        ParameterTest pt = new ParameterTest();

        /* 목차. 1. 기본자료형을 parameter로 전달 받는 메서드 호출  */
        /* 설명. 리터럴 값(참조 주소값 아님)을 전달해서 메서드를 호출 시 서로 다른 지역 변수이기 때문에 서로 영향 X */
        int num = 20;
        System.out.println("Call By Value 전: " + num);       // 리터럴 값에 의한 호출
        pt.TestPrimitiveTypeParameter(num);
        System.out.println("Call By Value 후: " + num);

        /* 목차. 2. 기본 자료형 배열을 parameter로 전달 받는 메서드 호출 */
        int[] iArr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Call By Reference 전: " + Arrays.toString(iArr));
        pt.TestPrimitiveTypeArrayParameter(iArr);    // 참조 값(주소값)에 의한 호출
        System.out.println("Call By Reference 후: " + Arrays.toString(iArr));

        /* 목차. 3. 클래스 자료형을 parameter로 전닳 받는 method 호출 */
        Rectangle r1 = new Rectangle(22, 12);
//        r1.calculateArea();
//        r1.calculateRound();

        pt.testClassTypeParameter(r1);

        /* 목차. 4. 아직 클래스 배열(객체 배열)은 배우지 않았으므로 pass */

        /* 목차. 5. 가변인자를 parameter로 전달 받는 메서드 호출(java는 웬만하면 권장 X) */
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("Mel");
        pt.testVariableLengthArrayParameter("Mel", "Coffee");
        pt.testVariableLengthArrayParameter(new String[]{"Mel", "Coffee", "Movie"}); // 하나는 홪정으로 String으로 받으므로 오류남
    }
}
