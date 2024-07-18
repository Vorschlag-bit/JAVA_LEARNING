package com.ohgiraffers.section08.object_array.uses;
/* 설명. 회원 조회 잘하는 클래스 */
public class MemberFinder {
    public Member[] findAllmembers() {
        return MemberRepository.findAllMembers();
    }
}
