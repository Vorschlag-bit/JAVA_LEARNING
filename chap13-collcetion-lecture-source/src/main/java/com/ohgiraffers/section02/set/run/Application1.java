package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다. */
        HashSet<String> set = new HashSet<>();
        set.add(new String("java"));
        set.add(new String("mariadb"));
        set.add(new String("servlet"));
        set.add(new String("spring"));
        set.add(new String("boot"));

        /* 설명. Set에 저장된 자료는 넣는 순서를 보장할 수 없다. */
        System.out.println("set: " + set);

        /* 설명. 중복값(동등 객체)은 Set에 추가되지 않는다.(e, h 오버라이딩 필요) */
        /* 설명. 중복 되는 값이 있으면 새로 추가하려는 객체가 튕겨나가는 구조(덮어쓰는 건 아니다) */
        set.add(new String("mariadb"));
        set.add(new String("mariadb1"));
        System.out.println("set = " + set);


        /* 설명. Sest은 인덱스 개념이 없어 iterartor(반복자)를 활용해야 한다. */
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /* 설명. 배열로 바꾸면 배열의 개념으로 활용할 수도 있다. */
        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((String)arr[i]);
        }

        System.out.println("size: " + set.size());
        set.clear();
        System.out.println("size: " + set.size());
    }
}
