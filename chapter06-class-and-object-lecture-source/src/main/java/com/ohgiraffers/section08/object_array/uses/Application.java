package com.ohgiraffers.section08.object_array.uses;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MemberService memberManager = new MemberService();

        while(true) {
            System.out.println("======= 회원 관리 프로그램 =========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: memberManager.signUpMembers(); break;
                case 2: memberManager.showAllMembers(); break;
                case 9:
                    System.out.println("Program shut down"); return;
                default:
                    System.out.println("wrong choice!");
            }
        }
    }
}
