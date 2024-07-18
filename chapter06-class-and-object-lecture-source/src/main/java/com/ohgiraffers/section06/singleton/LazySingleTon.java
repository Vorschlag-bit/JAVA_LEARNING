package com.ohgiraffers.section06.singleton;

public class LazySingleTon {

    private static LazySingleTon lazy;

    public static LazySingleTon getInstance() {
        if (lazy == null) {
            lazy = new LazySingleTon();     // 최초 getInstance에서 객체를 생성하고 다음부턴 그걸 그냥 호출만 해준다.
        }
        return lazy;
    };
}
