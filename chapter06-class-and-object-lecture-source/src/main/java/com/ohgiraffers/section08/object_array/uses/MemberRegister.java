package com.ohgiraffers.section08.object_array.uses;

/* 설명. 회원가입 잘 시키는 클래스(회원가입 페이지로 바뀌는 개념)*/
public class MemberRegister {

    /* 설명. 회원가입하겠다는 대상들을 한명 한명 저장했다고 보자 */
    public void regist(Member[] members) {
        System.out.println("회원을 등록합니다.");

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].getName() + "님이 회원 가입을 성공했습니다.");
        }

        /* 설명. 데이터베이스 개념에 회원을 insert */
        if(MemberRepository.store(members)) {
            System.out.println("총 " + members.length + "명의 회원 가입에 성공했습니다.");
        }
    }
}
