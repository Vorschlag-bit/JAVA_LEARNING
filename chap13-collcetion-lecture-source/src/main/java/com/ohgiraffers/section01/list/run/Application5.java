package com.ohgiraffers.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. Queue에 대해 이해하고 활용할 수 있다.
         *  필기
         *   Queue란?
         *   선형 메모리 공간에 데이터를 저장하여 순서를 유지하기 위한 선입선출(FIFO) 방식의 자료구조이다.
         *   대부분 LinkedList를 많이 사용한다.
         * */

        // Queue q = new Queue();  큐 자체는 인터페이스라 자체 객체를 생성 못 한다.
//        Queue<String> q = new LinkedList<>();
        /* 설명. LinkedList는 queue 중에서도 deque에 해당되어 offerFirst()sk offerLast() 같은 method를 제공한다. */
//        LinkedList<String> q = new LinkedList<>();

        /* 설명. PriorityQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다. */
//        PriorityQueue<String> q = new PriorityQueue<>();  String의 기준대로 문자열 오름차순
        PriorityQueue<String> q = new PriorityQueue<>(Collections.reverseOrder());   // 반대인 내림차순

        q.offer("first");
        q.offer("second");
        q.offer("third");
        q.offer("fourth");
        q.offer("fifth");
//        q.offerFirst()  양쪽으로 넣을 수 있는 deqeue가 되었다.

        System.out.println("q = " + q);

        System.out.println("peek() = " + q.peek());

        System.out.println("poll() = " + q.poll());
        System.out.println("q = " + q);
        System.out.println("poll() = " + q.poll());
        System.out.println("q = " + q);
        System.out.println("poll() = " + q.poll());
        System.out.println("q = " + q);
        System.out.println("poll() = " + q.poll());
        System.out.println("q = " + q);
        System.out.println("poll() = " + q.poll());
        System.out.println("q = " + q);
        System.out.println("poll() = " + q.poll());
        System.out.println("q = " + q);
        // 큐는 시간에 상관없이 순서를 정확하게 처리하고 싶을 때 사용하는 자료구조이다.

    }
}
