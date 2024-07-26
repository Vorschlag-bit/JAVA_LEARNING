package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;

import java.util.Scanner;

public class Application {

    // 어플리케이션은 항상 MemberService와 관련이 있다는 의미(Application의 모든 method를 갖다 쓸 수 있는 매우 가까운 관계(강결합)이다)
    private static final MemberService ms = new MemberService();   // Singleton과 비슷

    /* Domain:  수정할 때 영향을 받는 단위 */
    public static void main(String[] args) {
        // Aggregate : 이벤트가 발생하고 그로인해 영향을 받는 데이터들
        //(자바에서 다루는 데이터 타입이 담기는 의미로 사용한다)
        // Repository : db와 가장 친한 패키지, db와 연관된 작업을 하는 패키지
        // Service ; 로직(성공, 실패)을 확인하는 패키지
        // Run : 사용자가 사용하는 화면이자 입력공간이자 출력공간이다, 구동 + 화면 (= VIEW)
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("====== 회원 관리 프로그램 =======");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");       // 1. 관리자가 회원을 찾기  2. 로그인할 때 회원 찾기
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 탈퇴");
            System.out.println("5. 회원 수정");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴를 선택해 주세요: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: ms.findAllMembers(); break;
                case 2: ms.findMemberBy(chooseMember("조회할")); break;
                case 3: ms.registerMember(signUp()); break;
                case 4: ms.removeMember(chooseMember("탈퇴할")); break;
                case 5: Member selectedMeber = ms.findModMember((chooseMember("수정할 ")));
                        if(selectedMeber == null) break;
                        else {
                            boolean continueModifying = true;
                            while(continueModifying) {
                                System.out.println("-------- 회원 수정을 시작합니다 -------");
                                System.out.println("1. 비밀번호 수정하기");
                                System.out.println("2. 나이 수정하기");
                                System.out.println("3. 취미 수정하기");
                                System.out.println("4. 혈액형 수정하기");
                                System.out.println("5. 서비스 종료");
                                System.out.println("원하시는 서비스 번호를 입력하세요: ");

                                int ChoiceNo = sc.nextInt();
                                if(ChoiceNo == 5) continueModifying = false;
                                else modifyMember(ChoiceNo, selectedMeber);
                                ms.updateMember(selectedMeber);
                            }
                        } break;
                case 9: System.out.println("회원 관리 프로그램을 종료합니다."); return;
                default:
                    System.out.println("잘못된 번호입니다.");
            }
        }
    }

    private static void modifyMember(int ChoiceNo, Member selectedMeber) {
        Scanner sc = new Scanner(System.in);
        switch (ChoiceNo) {
            case 1: String pwd;
                while(true) {
                    System.out.print("변경하실 비밀번호를 입력하세요: ");
                    pwd = sc.nextLine();
                    if(pwd.trim().isEmpty()) {
                        System.out.println("입력값이 없습니다.");
                    }
                    else break;
                }
                selectedMeber.setPw(pwd);
                break;
            case 2: int age;
                while(true) {
                    System.out.print("변경하실 나이를 입력하세요: ");
                    String input = sc.nextLine();
                    try {
                    age = Integer.parseInt(input);
                    if(age <= 0 || age > 120) {
                        System.out.println("올바르지 않은 나이 범위입니다. 1세 이상 120세 이하로 입력해주세요.");
                        continue;
                    } break;
                    } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다.");
                    }
                }
            selectedMeber.setAge(age);
                break;
            case 3: String[] hobbies; int num;
            while(true) {
                System.out.print("변경하실 취미의 개수를 입력하세요: ");
                String input = sc.nextLine();
                try {
                    num = Integer.parseInt(input);
                    if(num < 0) {
                        System.out.println("올바르지 않은 개수입니다. 0개 이상을 입력해주세요.");
                        continue;
                    } break;
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다.");
                }
            }
            hobbies = new String[num];
            for(int i = 0; i < num; i++) {
                System.out.print((i + 1) + "번째 취미를 입력하세요: ");
                String input = sc.nextLine();
                hobbies[i] = input;
            } break;
            case 4: String BloodType;
                while(true) {
                    System.out.print("변경하실 혈액형을 입력해주세요: ");
                    String input = sc.nextLine().toUpperCase().trim();
                    if(input.equals("A") || input.equals("B") || input.equals("O") || input.equals("AB")) {
                        BloodType = input;
                        break;
                    }
                    else System.out.println("잘못된 입력입니다. 혈액형은 A, B, O, AB 중 하나를 입력해주세요.");
                }
                break;
            default:
                System.out.println("잘못된 요청입니다.");
                break;
        }
    }

    /* 설명. 관리자가 ID를 입력받아 반환하는 method */
    private static int chooseMember(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println(str + "id를 입력하세요: ");
        return sc.nextInt(); // 메모리를 아끼기 위한 변수 선언 부분 삭제
    }

    private static Member signUp() {
        Member newMember = new Member();

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("입력할 취미 개수를 입력하세요(1개 이상); ");
        int length = sc.nextInt();
        sc.nextLine(); // 버퍼 개행 문자 처리용

        String[] hobbies = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.print((i + 1) + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        System.out.print("혈액형을 입력하세요(A, B, AB, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch (bloodType) {
            case "A": bt = BloodType.A; break;
            case "B": bt = BloodType.B; break;
            case "AB": bt = BloodType.AB; break;
            case "O": bt = BloodType.O; break;
        }

        /* 필기.
        *   회원으로부터 회원가입을 위한 정보를 입력받아 Member 타입 객체 하나로 가공처리할 방법이 두 가지가 있다.
        *    1. 생성자 방식(장점: 한 줄 코딩, 단점: 따로 생성자를 추가 및 생성자의 매개변수가 다소 늘어날 수 있음(리팩토링 징조))
        *    2. Setter 방식(장점: 초기화할 개수 수정 용이, 가독성이 좋다, 단점: 코드의 줄 수가 늘어난다.
        * */

        newMember = new Member(id, pwd, age, hobbies);

        newMember.setBloodType(bt);

        return newMember;
    }
}
