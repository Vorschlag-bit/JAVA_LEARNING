package com.ohgiraffers.section07.initblock;

public class Product {
    private String name;
    private int price;
    private static String brand;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
