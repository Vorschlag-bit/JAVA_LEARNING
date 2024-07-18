package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();
        System.out.println("---- diff -----");

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();
        System.out.println("---- diff -----");

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();
        System.out.println("---- diff -----");

        Animal an1 = new Animal();     // 다형성 x
        // 자동형변환해준다. 자식은 부모의 속성을 숨길 수 있다.
        // 부모는 자식 객체의 존재를 모른다. 따라서 Tiger tiger = new Animal()은 불가능하다.
        // 자식이 부모 형변환은 가능하나, 부모가 자식 형변환은 불가능하기 때문이다.
        Animal an2 = (Animal) new Tiger();    // 다형성 o
        Animal an3 = (Animal) new Rabbit();   // 다형성 o
        // 이는 배열로도 응용이 가능하다, 다양한 자식 객체를 부모 객체의 배열로 저장할 수 있기 때문이다.

        /* 설명. Animal은 Tiger나 Rabbit이 아니다.(Animal은 Tiger나 Rabbit타입을 갖고 있지 않다. */
//        Tiger t1 = new Animal();

        /* 설명. 동적바인딩 확인하기 */
        /* 필기.
        *  컴파일 당시에는 해당 타입의 method와 연결되어 있다가
        *  런타임 당시 실제 객체가 가진 Override된 method로 바인딩이 바뀌어 동작하는 걸 의미한다.
        *  (동적 바인딩의 조건: 1. 상속, 2. Overriding)
        *  */
        System.out.println("===== 동적 바인딩 확인하기 ======");
        an1.cry();
        an2.cry();
        an3.cry();
        // 해석시점에는 animal의 cry로 묶어놓는다 (정적 바인딩), 컴파일 시점
        // 그러나 런타임 시점에선 객체가 생성되면서 an1, 2, 3가 인지되면서 어떤 cry method를 불러야할지 알게된다.

        /* 설명. 부모타입(Animal)은 자식 타입(Tiger)로 강제 형변환이 가능하다.(단 조심해야 한다) */
//        ((Tiger) an3).cry();    compile 시점에는 에러가 나지 않고 Runtime 시점에 에러가 발생

        /* 설명. 오버라이딩 되지 않은(추가한 method) method 호출은 다운 캐스팅을 해줘야 한다. */
        /* 필기.
        *  instanceof란?
        *  해당 객체의 타입을 '런타임 시점'에서 확인하기 위한 boolean 연산자 */
        if(an3 instanceof Tiger) {
            ((Tiger) an3).cry();
        }
        // 객체 종류를 정확히 알지 못 하면서 특정 객체의 고유 method를 사용하고 싶을 때
        // instanceof로 객체 정체를 확인하고 그 method를 호출한다.

        if(an3 instanceof Rabbit) {
            System.out.println("an3는 토끼가 맞습니다.");
        }

        /* 설명. 다형성은 상속관계의 객체들간의 형변환 */
        Animal animal2 = new Tiger();     // 다형성을 적용. 자동형변환(auto up-casting), 묵시적 형변환
        Rabbit rabbit2 = (Rabbit) an3;    // 다형성이 적용되지 않음, 강제형변환(down-casting), 명시적 형변환
    }
}
