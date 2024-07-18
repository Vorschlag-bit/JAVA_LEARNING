package com.ohgiraffers.section01.extend.section03.overriding;

public class SuperClass {
    /* 설명. class가 final 키워드가 붙으면 부모 클래스가 될 수 있다. */
//public final class SuperClass {

    /* 수업목표. 오버라이딩(Overriding)에 대해 이해할 수 있다. */

    public void method(int num) {}

    public Object method2(int num) {return null;}

    private void privateMethod() {}

    // 내 자식은 더이상 없다는 의미
    public final void finalMethod() {}

    // 내 자식이면 접근할 수 있는 접근제어자, 다른 패키지라도 자식 클래스면 호출 가능!(자식이라는 개념으로 default보다 조금 더 넓은 의미)
    protected void protectedMethod() {}

    //접근제어자 없는 method(= default), 다른 패키지에선 호출 불가능
    /* 설명. default 접근 제어자는 접근제어자를 명시하지 않는 것이다. */
    void defunctMethod() {}
}
