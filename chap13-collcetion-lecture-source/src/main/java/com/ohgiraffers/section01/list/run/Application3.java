package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. List 계열을 반복시키는 4가지 방법 */
        /* 수업목표. LinkedList에 대해 이해할 수 있다 */
//        List<String> arrList = new ArrayList<>();
        List<String> arrList = new LinkedList<>();
        arrList.add("apple");
        arrList.add("banana");
        arrList.add("orange");
        arrList.add("mango");
        arrList.add("pineapple");

        /* 설명. 1. toString() 활용하기 */
        System.out.println("arrList = " + arrList);
        /* 설명. 2. for문 활용하기 */
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
        /* 설명. 3. for-each 활용하기 */
        for(String str : arrList) {
            System.out.println(str);
        }
        /* 설명. 4. iterator 활용하기 */
        Iterator<String> iterator = arrList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /* 설명. 1. index의 과일 수정 */
        arrList.set(1, "watermelon");
        System.out.println("arrList = " + arrList);

        /* 설명. 2. list가 관리하는 요소를 제거 */
        arrList.remove(1);       // LinkedList는 ArrayList와 달리 '부분적인 요소 제거'에서 성능이 우수하다!
        System.out.println("arrList = " + arrList);
        arrList.clear();               // 전체 요소들 제거
        System.out.println("arrList = " + arrList);

        /* 설명. 요소가 없는 list계일인지 확인 */
        System.out.println("isEmpty = " + arrList.isEmpty());
    }
}
