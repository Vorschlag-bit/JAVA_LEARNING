package com.ohgiraffers.section01.extend.section02.superkeyword;

import java.util.Date;

// 클래스 간의 부모와 자식에 대한 관계를 알고 싶을 때, A는 하나의 B이다 or B는 하나의 A이다.로 테스트
// 영어론 A is a B or B is a A. 둘이 전혀 맥락이 없다면 상속관계가 아닌 것
public class Computer extends Product {

    private String Cpu;
    private int hdd;
    private int rma;
    private String operatingSystem;

    // 부모 기본 + 자식 기본 생성자 JVM이 알아서 작성
    public Computer() {
        super();
    }

    // 부모는 기본생성자 + 자식은 임의의 값으로 초기화
    public Computer(String cpu, int hdd, int rma, String operatingSystem) {
        Cpu = cpu;
        this.hdd = hdd;
        this.rma = rma;
        this.operatingSystem = operatingSystem;
    }

    // 부모의 매개변수도 초기화하고 자식의 매개변수도 초기화하는 생성자
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int rma, String operatingSystem) {
        super(code, brand, name, price, manufacturingDate);
        Cpu = cpu;
        this.hdd = hdd;
        this.rma = rma;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
//        return "Computer{" +
//                "Cpu='" + Cpu + '\'' +
//                ", hdd=" + hdd +
//                ", rma=" + rma +
//                ", operatingSystem='" + operatingSystem + '\'' +
//                '}';
        return super.toString() +
                "Computer{" +
                "Cpu='" + Cpu + '\'' +
                ", hdd=" + hdd +
                ", rma=" + rma +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
