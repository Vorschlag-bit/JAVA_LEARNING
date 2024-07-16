package com.ohgiraffers.section08.object_array.uses;

/* 설명. Database와 직접적으로 연관된 클래스 */
public class MemberRepository {

    /* 설명. static 변수 선언으로 Member 객체를 담는 배열을 테이터베이스 취급 */
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
