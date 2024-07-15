package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement() {
        int i = 1;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
    }

    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);

        char answer = '\0';
        while(!(answer == 'Y' || answer == 'y')) {
            System.out.println("Could you press Y or y?");
            answer = sc.next().charAt(0);
        }
        System.out.println("Thank you for service!");
    }
}
