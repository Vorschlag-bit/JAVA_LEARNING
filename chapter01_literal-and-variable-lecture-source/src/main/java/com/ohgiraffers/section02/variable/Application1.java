package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. 변수의 사용 목적에 대해 이해할 수 있다 */
        /* 목차. 1. 값에 의미를 부여하기 위한 목적 */
        System.out.println("========== 값에 의미 부여 테스트==========");
        System.out.println("보너스를 포함한 급여: " + (1000000 + 200000) + "원");

        int salary = 1000000;
        int bonus = 2000000;

        System.out.println("보너스를 포함한 급여: " + (salary + bonus) + "원");


        /* 목차. 2. 한번 저장해둔 값을 재활용하기 위한 목적 */
        System.out.println("=========== 변수에 저장한 값 재사용 테스트 ===========");

        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");

        System.out.println();    // =\n

//        int point = 100;
        int point = 200;            //쉽게 포인트를 수정할 수 있다.(재사용을 통한 유지보수 측면 개선!)
        System.out.println("1번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("2번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("3번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("4번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("5번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("6번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("7번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("8번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("9번 고객에게 포인트를" + point + "지급하였습니다");
        System.out.println("10번 고객에게 포인트를" + point + "지급하였습니다");

        /* 목차. 3. 시간에 따라 변경되는 값을 저장하고 사용할 목적 */ // 여기서 시간이란 컴파일러가 코드를 읽어나가는 방향순서
        System.out.println("======== 변수에 저장된 값 변경 테스트 =========");
        int sum = 0;

        sum = sum + 10;    // 현재 sum에는 10
        System.out.println("sum에 10을 더하면: " + sum);

        sum = sum + 10;   // 현재 sum에는 20
        sum = sum + 10;   // 현재 sum에는 30
        sum = sum + 10;   // 현재 sum에는 40
        sum = sum + 10;   // 현재 sum에는 50
        System.out.println("sum에 10을 네 번 더하면: " + sum);

        /* 설명.동일한 sum이라는 하나의 변수를 어느 시점에 보느냐에 따라 들어있는 값은 달라진다. */
    }
}
