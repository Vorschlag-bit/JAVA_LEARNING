package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. Singleton 패턴에 대해 이해하고 구현할 수 있다. */
        /* 필기.
         *  singleton pattern이란?
         *  애플리케이션이 시작되고 난 후 어떤 클래스가 최초 '한 번만' 메모리에 할당(객체)되고
         *  그 메모리에 인스턴스가 단 하나만 생성되어 공유되게 하는 것을 Singleton pattern이라고 한다.
         *  (메모리 및 리소스 낭비 방지 목적) */

        /* 필기.
        *  장점
        *  1. 첫 번째 이용 시에는 인스턴스를 생성하야 하므로 속도 차이가 나지 않지만
        *     두 번째 이용 시에는 인스턴스 생성 시간 없이 바로 사용할 수 있다.(재사용)
        *  2. 인스턴스가 절대적으로 한 개만 추구하는 것으로 보증할 수 있다.
        * 단점
        *  1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
        *  2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 높다.
        *
        * 필기.
        *  싱글톤 구현 방법
        *  1. 이른 초기화(Eager Initialization)
        *  2. 늦은 초기화(Lazy Initialization)
        *  */
        // 어디서든 객체 하나만 생성해서 사용하자
        EagerSingleton eager1 = EagerSingleton.getInstance(); // 프로그램을 켜자마자 생성된 객체의 주소
        EagerSingleton eager2 = EagerSingleton.getInstance();
//        EagerSingleton eager3 = new EagerSingleton();  // Singleton 위배
        System.out.println("eager1 = " + System.identityHashCode(eager1));
        System.out.println("eager2 = " + System.identityHashCode(eager2));

        LazySingleTon lazy = LazySingleTon.getInstance();        // 이 시점에서 객체가 생성
        LazySingleTon lazy2 = LazySingleTon.getInstance();
        System.out.println("lazy1 = " + System.identityHashCode(lazy));
        System.out.println("lazy2 = " + System.identityHashCode(lazy2));;
    }
}
