package com.ohgiraffers.section04.constructor;

public class User {
    private String id;
    private String pw;
    private String name;
    private java.util.Date enrollDate;

    public User() {

    }

    public String information(){
        return "id: " + this.id + ", pw: " + this.pw +
                ", name: " + this.name + ", enrollDate: " + this.enrollDate;
    }
}
