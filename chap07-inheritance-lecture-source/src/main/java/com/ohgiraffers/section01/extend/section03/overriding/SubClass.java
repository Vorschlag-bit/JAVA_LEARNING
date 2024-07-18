package com.ohgiraffers.section01.extend.section03.overriding;

import java.util.ArrayList;

public class SubClass extends SuperClass {

    /* 설명. 부모 method와 이름, 반환형, parameter, 접근제어자 모두 동일하게 Override */

    @Override
    public void method(int num) {
    }

    /* 설명. method 이름변경(새로운 method로 재탄생) */
//    @Override
//    public void method(int num) {
//    }

    /* 설명. method return 타입 변경(새로운 method로 재탄생) */
//    @Override
//    public String method(int num) {
//        return null;
//    }

    /* 설명. 경우에 따라서는 method의 반환형을 '다르게' 할 수도 있다!
       (부모 method의 return type으로는 가능)
       부모가 Animal 타입을 반환하면 자식은 Dog 타입 반환이 가능하다는 소리 */
    @Override
    public ArrayList<String> method2(int num) {
        return null;
    }

    /* 설명. private method는 Overriding 불가 */
    // 아무리 똑같이 헤드를 적어도 오류가 나온다.
//    @Override
//    private void privateMethod() {}

    /* 설명. final method는 Overriding 불가능! 자식 빼고 다른 얘들은 접근 가능하다 */
//    public final void finalMethod() {}


    /* 설명. 부모타입이 protected면 어디서든(어느 패키지든) 접근해서 Overriding 가능! */
//    @Override
//    protected void protectedMethod() {}

    /* 설명. 부모 method의 접근 제어자'이상'의 범위를 가진 접근 제어자로 바꾸기 가능하다! */
    @Override
    public void protectedMethod() {}
}
