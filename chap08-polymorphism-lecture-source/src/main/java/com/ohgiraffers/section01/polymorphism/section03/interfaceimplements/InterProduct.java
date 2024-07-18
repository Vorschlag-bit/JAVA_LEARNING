package com.ohgiraffers.section01.polymorphism.section03.interfaceimplements;
// 인터페이스는 구현할 수 없으므로 상속 키워드인 extend를 사용해야 하며 다중 상속이 가능하다.
public interface InterProduct extends ParentInterproduct, AnotherInterProduct {

//    public static final int MAX_NUM = 100;
    int MAX_NUM = 100;          // 상품 최대 100개만 저장 가능하고 이 값을 고정해서 사용해라
//    private static final int NIM_NUM = 20;     다르게 변형해서 쓸 수 없다.

    /* 설명. 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct(){}

    /* 설명. 기본적으로 abstract method만 가능하다. */
//    private void nonStaticmethod();     public sabstract만 가능
//    public abstract void nonStaticMethod();
    void nonStaticMethod();

    /* 설명. static method는 바디부까지 작성을 허용했다.(JDK 1.8부터 추가된 기능) */
    public static void staticMethod() {}

    /* 설명. non-static Mehotd라도 default 키워드를 추가하면 바디부까지 작성을 허용(JDK 1.8부터) */
    public default void finalMethod() {}

    /* 설명. private도 abstract가 아닌 온전한 method로 사용 가능하다(default도 없이) */
    private void privateMethod() {}

    /* 설명. 다른 public default Method에서 활용할 수만 있는 기능 */
}
