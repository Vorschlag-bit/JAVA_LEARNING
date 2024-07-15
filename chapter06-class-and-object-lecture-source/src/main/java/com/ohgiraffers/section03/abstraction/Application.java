package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CarRacer racer = new CarRacer();
        int choice = 0;
        do {
            System.out.println("========== CarRacer ==========");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: racer.startUp();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 9:
                    System.out.println("Programm shut down");
                    break;
                default:
                    System.out.println("wrong choice");
            }
        } while(choice != 0);
    }
}
