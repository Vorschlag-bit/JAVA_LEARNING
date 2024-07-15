package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {        // 이 메서드를 호출한 Monster객체의 hp값을 설정할 수 있다.
        if(hp > 0) this.hp = hp;
        // 오른쪽 하얀 hp는 넘겨온 값
        // 왼쪽은 이 메서를 호출한 객체
        // 직접접근을 막아 오염된 값(여기선 음수)이 객체에 설정되지 않도록 만들 수 있다.

        
        else if(hp <= 0) this.hp = 0;
    }
}
