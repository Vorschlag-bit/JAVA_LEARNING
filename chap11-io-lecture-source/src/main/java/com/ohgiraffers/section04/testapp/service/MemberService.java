package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. Transaction 처리(성공 실패에 따론 commit/rollback) 및 회원관련 비즈니스 로직 처리 */
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void findAllMembers() {
        ArrayList<Member> findMembers = mr.selectAllMembers();

        for(Member member : findMembers) {
            /* 설명. 제대로 멤버를 가져왔는지 확인하는 출력문 */
            System.out.println("member = " + member);
        }
    }

    public void findMemberBy(int memNo) {
       Member selectedMember = mr.selectMemberBy(memNo);
        if(selectedMember != null) {
            System.out.println("조회된 회원은: " + selectedMember.getId() + "아이디 회원");
        }
        else {
            System.out.println("그런 회원은 없습니다.");
        }
    }
    // 이 코드 기준으로 위는 조회, 아래는 DML을 다룬다.(Rollback 및 Commit)

    public void registerMember(Member newmember) {

        int lastMemberNo = mr.selectLastMemberNo();
        newmember.setMemNo(lastMemberNo + 1);
        int result = mr.insertMember(newmember);
//        System.out.println("성공실패 유무 확인: " + result);
        if(result == 1) {
            System.out.println(newmember.getId() + "님 회원 가입 해 주셔서 감사합니다!");

            /* 설명. JDBC 이후에는 commit/rollback 처리도 할 예정 */
        }
    }

    public void removeMember(int removeMember) {
        int result =  mr.deleteMember(removeMember);
        if(result == 1) {
            System.out.println("다시 돌아오세요...");
            return;
        }
        System.out.println("회원 번호가 잘못됐습니다.");
    }


    public Member findModMember(int memNo) {
        Member selectMember = mr.selectMemberBy(memNo);

        if(selectMember == null) {
            System.out.println("검색하신 회원은 존재하지 않습니다.");
            return null;
        }
        else {
            System.out.println("조회된 회원의 아이디는 " + selectMember.getId() + "입니다.");
            return selectMember;
        }
    }

    public void updateMember(Member selectedMeber) {
        int result = mr.edit(selectedMeber);

        if(result == 1) {
            System.out.println("회원 정보를 성공적으로 수정했습니다!");
            return;
        }
        System.out.println("수정 내역이 없습니다.");
    }
}
