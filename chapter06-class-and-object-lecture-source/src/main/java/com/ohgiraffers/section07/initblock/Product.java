package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "iphone";
    private int price;
    private static String brand;

    {
        System.out.println("초기화 블럭 생성");
        name = "sony";
        brand = "LG";
    }
    // 객체와 아무 상관없이 static 영역에 미리 할당되어 있기 때문에, static 생성자로 선언한 건 문제없으나, 일반 생성자로 선언하면 오류가 나온다
    static {
        brand = "Cyon";
    }

    public Product() {
        System.out.println("Product 기본 생성자 호출...");
        name = "iPhono";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", brand='" + Product.brand + '\'' +
                '}';
    }
}
