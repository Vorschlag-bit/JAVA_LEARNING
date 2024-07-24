package com.ohgiraffers.section02.extend.vo;

/* 설명.
*   WildCard
*   제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때 타입 변수를 제한할 수 있다.
*   <?>: 제한 없음
*   <? extends Type>: 와일드카드의 상한 제한(Type의 상위 객체는 올 수 없다)
*   <? super Type>: 와일드카드의 하한 제한(Type과 동등한 객체나 하위 객체를 올 수 없다)
* */
/* 설명. 제네릭 타입을 활용하는 기능을 포함하는 클래스 */
public class WildCardFarm {

    /* 설명. 어떤 타입의 RabbitFarm(제네릭 타입)이 와도 상관 없다.
    * RabbitFarm에는 Rabbit 및 하위 객체들만 생성될 수 있는 클래스이다. */
    public void anyType(RabbitFarm<?> farm) {  // 토끼만 들어올 수 있는 토끼농장
        farm.getAnimal().cry();
    }

    /* 설명. RabbitFarm 중에서도 Bunny 또는 Bunny의 하위 객체만 있는 RabbitFarm으로만 생성 가능하다 */
    // Bunny 혹은 Bunny 하위 객체만 들어올 수 있는 class 형성
    public void extendsType(RabbitFarm<? extends Rabbit> farm) {
        farm.getAnimal().cry();
    }

    /* 설명. RabbitFarm 중에서도 Bunny 또는 상위 객체만 있는 RabbitFarm만 생성가능 */
    // Bunny 타입 및 상위 객체만 들어올 수 있는 class 생성
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
}
