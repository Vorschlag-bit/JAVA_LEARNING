package com.ohgiraffers.section04.constructor;

public class User {
    private String id;
    private String pw;
    private String name;
    private java.util.Date enrollDate;
    /* 설명. 기본 생성자(parameter가 없는)를 활용한 객체 생성
    * 기본 생성자는 '반드시' 명시적으로 써주도록 하자!(나중에 프레임워크에서 매우 중요함)*/
    public User() {
        System.out.println("User 객체 생성");
    }
    // parameter의 우선 순위가 높아서 this를 안 붙일 경우 꼬인다. (parameter 명을 바꾸면 해결되긴 함)
    public User(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public User(String id, String pw, String name, java.util.Date enrollDate) {
        /* 설명. 생성자 내부의 this.은 이 생성자로 생성될 객체를 의미 */
//        this.id = id;
//        this.pw = pw;
//        this.name = name;
        // this.과 this()의 차이 = 같은 클래스의 다른 생성자를 호출하는 게 this()이다!
        /* 설명. this()를 통해 다른 생성자를 활용하여 코드의 줄 수를 줄일 수 있다. */
        /* 설명. this()를 통해 다른 생성자를 호출할 때는 '한 번만' 코드 '첫 줄'에서만 활용 가능!
        *  다른 생성자가 덮어 씌우면 안 되기 때문 */
        this(id, pw, name);
        this.enrollDate = enrollDate;
    }

    public String information(){
        return "id: " + this.id + ", pw: " + this.pw +
                ", name: " + this.name + ", enrollDate: " + this.enrollDate;
    }
}
