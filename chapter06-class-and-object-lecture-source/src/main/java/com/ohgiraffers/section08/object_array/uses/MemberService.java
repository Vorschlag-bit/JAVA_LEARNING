package com.ohgiraffers.section08.object_array.uses;

import java.util.Arrays;

public class MemberService {

    /* 설명. 회원가입을 5명 진행하고 저장하기 위해 저장용 객체(Register)에게 호출 */
    public void signUpMembers() {
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "Bred", 29, 'M');
        members[1] = new Member(2, "user01", "pass01", "Bred", 22, 'M');
        members[2] = new Member(3, "user01", "pass01", "Bred", 24, 'M');
        members[3] = new Member(4, "user01", "pass01", "Bred", 43, 'M');
        members[4] = new Member(5, "user01", "pass01", "Bred", 38, 'M');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }

    public void showAllMembers() {

        MemberFinder finder = new MemberFinder();
        System.out.println("======= 가입된 회원 목록 ==========");
        System.out.println(Arrays.toString(finder.findAllmembers()));
    }
}
