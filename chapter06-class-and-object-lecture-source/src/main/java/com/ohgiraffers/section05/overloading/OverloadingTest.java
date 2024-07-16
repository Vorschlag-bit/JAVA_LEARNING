package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /* 수업목표. 오버로딩(Overloading)에 대해 이해할 수 있다. */
    /* 통일된 인터페이스를 가져가기 위함(Println이라는 메서드 이름을 모두 공유함으로써 메서드명을 아끼기 가능) */

    // method명이 같더라도 method signature가 다르다면 중복처리하지 않는다(= Overload)
    // 심지어 반환형이 달라서 메서드 시그니처가 같다면 중복처리한다. method signature는
    // parameter 의 개수, 타입, 순서가 같아야 한다.

    /* 필기.
    * method Signature?
    * public void method(int n)이라면 method의 이름과 parameter 선언부 부분을
    * method Signature라고 부른다. (= method(int n))
    *  필기.
    *  동일한 method 이름으로 다양한 종류의 parameter에 따라 처리해야 하는 경우 적용하는 기술을
    *  Overload라고 한다.
    *
    *  필기.
    *  Overlaoding의 조건?
    *  parameter의 타입, 개수, 순서를 다르게 작성하여 하나의 클래스 내에 동일한 이름의 method를
    *  여러 개 작성할 수 있다.
    *  method의 헤드부에 있어 Signature를 제외한 부분이 다르게 작성되는 것은 인정하지 않는다.
    *  public void test() = public staic test() = public String test() */
    public void test() {}

    /* 설명. parameter의 개수가 달라짐 */
    public void test(int num) {}

    public void test(int num1, int num2) {}

//    public void test(int num2, int num1) {} //parametet 변수명은 무관하다

    /* 설명. parameter의 type이 달리짐 */
    public void test(int num, String name) {}

    /* 설명. parameter의 순서가 달라짐(타입만 고려) */
    public void test(String name, int num) {}


}
