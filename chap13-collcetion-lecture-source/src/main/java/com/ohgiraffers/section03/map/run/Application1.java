package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        Map<Object, Object> map = new HashMap<>(); // 어떤 타입이든 Key와 Value가 될 수 있다.
        map.put("one", new Date());
        map.put(21, "Black jack");
        map.put("let go", 7);

        System.out.println("키가 \" one\"인 value 값: " + map.get("one"));
        System.out.println("Map의 toString(): " + map);  // key와 value를 묶어 entry라고 부르며 이들을 toString()으로 호출하면 '='을 달고 호출된다.

        map.put(new BookDTO("고길동전", 1, "허균", 5000), "허균s book"); // 객체를 Key로 사용할 수도 있다!
        System.out.println("map의 키 값으로 활용되는 객체를 활용: "
                                + map.get(new BookDTO("고길동전", 2, "허균", 57770)));  // null 출력 -> 주소값이 다른 객체이기 때문이다
        // '동등'비교를 하기 위해선 반드시 equals와 hashCode를 Override해야만 한다! (둘 다)
        // 가격, 책 번호가 달라도 우리가 설정한 equals()에의해 작가과 책 이름만 같으면 동등하다고 판단하기에 중복이 허용되게 만들었다.

        // 21의 value였던 black jack이 esse로 덮어씌어진다.
        map.put(21, "esse");
        System.out.println("map = " + map);

        /* 설명. Map을 활용해 보자(반복하여) */
        Map<String, String> sm = new HashMap();
        sm.put("one", "java 17");
        sm.put("two", "java 8");
        sm.put("three", "java 9");
        sm.put("four", "java 11");
        sm.put("five", "mariadb");

        /* 목차. 1. KeySet()을 활용한 iterator 반복하기(feat. key값만 set으로 변환하기) */
        // HashMap은 반드시 사용법을 숙지(현업에서 매우 많이 사용한다)
        Set<String> keys = sm.keySet();
        Iterator<String> iter= keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println("key = " + key + ", value = " + sm.get(key));
        }



    }
}
