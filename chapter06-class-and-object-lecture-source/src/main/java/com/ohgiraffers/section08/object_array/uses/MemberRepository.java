package com.ohgiraffers.section08.object_array.uses;

/* 설명. Database와 직접적으로 연관된 클래스
*  오로지 DB 단일 책임을 지게 하여, 다른 클래스들로부터 영향을 받지 않게 함 => 유지보수에서 장점도 있다. */
public class MemberRepository {

    /* 설명. static 변수 선언으로 Member 객체를 담는 배열을 테이터베이스 취급 */
    /* 설명. final 키워드 => 배열의 주소값만 고정! 배열의 값은 다른 이야기이다.. */
    private static final Member[] members = new Member[10];
    private static int count;   // 회원 배열과 함께 돌아가야하므로 static

    public static boolean store(Member[] newmembers) {
        for (int i = 0; i < newmembers.length; i++) {
            members[count++] = newmembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }
}
