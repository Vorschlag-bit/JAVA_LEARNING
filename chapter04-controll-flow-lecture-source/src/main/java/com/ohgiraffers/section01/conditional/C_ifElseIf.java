package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

//    public void testSimpleIfElseIfStatement(){
//        System.out.println("산 속에서 나무를 하면서 나무꾼이 도끼를 푸엉덩하고 빠뜨려 버렸다.");
//        System.out.println("연못에선 산신령이 도끼에 팔이 다친 채로 등장했다.");
//        System.out.println("네 이노오옴!! 산신령은 불같이 화를 내며 죽일 듯한 기세였다.");
//
//        System.out.println("네 놈이 던진 것이냐? (1. 네 2. 사슴이 던짐 3. 선녀가 던짐)");
//
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//
//        if(choice == 1){
//            System.out.println("그대로 도끼에 머리가 찍혀 사망");
//        }
//        else if(choice == 2){
//            System.out.println("도끼를 들고 연못에서 뛰쳐 나오는 산신령");
//        }
//        else {
//            System.out.println("도끼를 하늘로 던지는 산신령");
//        }
//
//        System.out.println("산신령은 매우 강하다.");
//    }


    public void testIfElseIfStatement() {

        /* 설명.
         *   ohgiraffers 대학의 이교수는 학생 시험 성적을 수기로 계산하여 학점 등급을 매기는
         *   채점방식을 택하고 있다.
         *  90점 이상이면 에이, 80점 이상이면 비, 70점 이상이면 씨, 60점 이상이면 디, 마지막으로
         *   60점 미만이면 에프를 준다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         *  추가로 각 등급의 중간 점수(95,85,75 등)이상인 경우 +를 붙인다.
         *
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하시오");
        String name = sc.next();
        System.out.println("점수를 입력하시오");
        int score = sc.nextInt();
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else grade = "F";

        if (score == 100 || score % 10 >= 5 && score >= 60) grade += "+";

        System.out.println("학생 점수는 " + score + "점이고, 등급은 " + grade + "입니다.");
    }
}
