package com.ohgiraffers.section06.singleton.statickeyword;

public class StaticTest {
    // 프로그램을 키자마자 staticCount라는 변수가 static 영역에 할당
    // 그 후 main에 있는 객체가 변수명은 스택, 객체는 힙에 할당, static 영역에는 StaticTest라는 소속으로 존재
    private int nonStaticCount;
    // private한 static 변수에 접근하기 위해선 static method로만 접근이 가능
    private static int staticCount;

    public StaticTest() {

    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }
    // 이 method를 호출하기 위해선 객체가 필요하지만
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }
    // 이 method는 객체가 필요없다(static int이므로)
    public static void increaseStaticCount() {
        staticCount++;
    }
}
