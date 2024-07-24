package com.ohgiraffers.section3.math;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */
        /* 설명. 참고로, java.lang 패키지 소속은 import 또는 풀 클래스명을 쓸 필요가 없다. */
        /* 설명. 1. 절대값 출력 */
        System.out.println("-32.1의 절대값 " + Math.abs(-32.1));     // java.lang 소속 클래스들은 java.lang을 생략할 수 있다.
        /* 설명. 2. 최대, 최소값 출력 */
        System.out.println("20과 330 중 더 큰 것은: " + Math.max(330, 20));    // 자바가 구현한 것도 그냥 삼항연산자로 구현했다.
        System.out.println("20과 330 중 더 작은 것은: " + Math.min(330, 20));
        /* 설명. 3. 난수 생성 */
        System.out.println("난수 생성: " + Math.random());      // 0.0000~~부터 0.99999999..사이 생성
    }
}
