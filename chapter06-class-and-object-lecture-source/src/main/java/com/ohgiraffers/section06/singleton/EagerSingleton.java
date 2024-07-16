package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    // 이른 초기화
    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {
        // 진정한 singleton으로 거듭나기 위한 private
    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
