package com.ohgiraffers.section08.object_array.uses;

public class Member {
    private int num;
    private String id;
    private String pw;
    private String name;
    private int age;
    private char gender;

    public Member(int i, String user01, String pass01, String bred, int i1, char m) {
        this.num = i;
        this.id = user01;
        this.pw = pass01;
        this.name = bred;
        this.age = i1;
        this.gender = m;
    }

    public int getNum() {
        return num;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Member{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
