package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. extends 키워드를 사용하여 특정 타입만 Generic 타입으로 사용하도록 제한할 수 있다. */
        /* 설명. Rabbit 상위 객체이거나 Rabbit의 자식 타입이 아닌 타입으로 제네릭을 지정하면 컴파일 에러가 발생한다. */
//    RabbitFarm<Animal> rabbitFarm = new RabbitFarm<>();   Rabbit의 상위 객체는 사용할 수 없다!
//    RabbitFarm<Mammal> farm1 = new RabbitFarm<>();
//    RabbitFarm<Snake> farm2 = new RabbitFarm<>();

        /* 설명. Rabbit 또는 Rabbit의 하위 객체로는 인스턴스 형성이 가능하다(<T extends Rabbit>) */
        RabbitFarm<Rabbit> farm3 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm4 = new RabbitFarm<>();
        RabbitFarm<DrunkenRabbit> farm5 = new RabbitFarm<>();

        farm3.setAnimal(new Rabbit());
        farm3.getAnimal().cry();
        farm3.setAnimal(new Bunny());
        farm3.getAnimal().cry();      // 동적 바인딩에 의해 반환형이 Animal의 cry()가 아닌
                                      // 실제 객체인 Bunny의 cry()가 실행된다.

        farm4.setAnimal(new Bunny());
        farm4.getAnimal().cry();

        farm5.setAnimal(new DrunkenRabbit());
        farm5.getAnimal().cry();
    }
}
