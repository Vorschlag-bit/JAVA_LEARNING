package com.ohgiraffers.section01.extend.section02.superkeyword;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. super.와 super()에 대해 이해할 수 있다. */
        /* 필기.
        * super.: 자식 클래스 타입의 객체가 생성될 때 먼저 생성된 부모 클래스 타입의 객체의 주소값(참조값)을 통해 접근
        * super(): 부모로부터 물려받지 못한 생성자를 부모 클래스에 있는 생성자를 활용하기 위해 사용 */

        Product product1 = new Product();
        System.out.println(product1);

        Product product2 = new Product("p01", "playData", "Java", 1000, new java.util.Date());
//        System.out.println(product2);
//        System.out.println(new java.util.Date().toString());

        Computer c1 = new Computer();
        System.out.println(c1);

        Computer c2 =
                new Computer("Snap Dragon", 512, 16, "Android");
        System.out.println(c2);

        Computer c3 =
                new Computer("s-123", "Google", "Pixel", 100000, new java.util.Date(),
                        "Snap Dragon", 1024, 32, "window");
        System.out.println(c3);
    }
}
