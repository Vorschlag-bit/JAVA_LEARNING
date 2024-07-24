package com.ohgiraffers.section01.extend;
// extend에 여러 개 못 넣는다(java는 단일 상속만을 지원!)
public class FireCar extends Car {

    public FireCar() {
        // 아래의 부모 생성자는 사실 자동으로 자바가 써준다.
        /* 설명. 부모로부터 생성자는 물려받지 않고 super()를 통해 부모 객체 먼저 생성! */
        super();
        System.out.println("FireCar Class의 기본 Constructor!");
    }

    /* 설명. 부모로부터 물려받은 field 및 method 외에 고유 기능 추가(= 확장) */
    public void sprayWater() {
        System.out.println("불난 곳을 발견! 물을 뿌립니다. 퓨슈수숙!!");
    }

    // 부모로부터 물려 받았지만 '재정의', 아직은 접근 제어자, 반환형, method 명까지 같아야 한다.
    @Override  // Annotation! method명 틀렸는지 확인 + 부모로부터 물려받음을 명시!
    /* 필기.
    *  @Override Annotation을 추가하는 이유?
    *   1. method 중 부모로부터 물려받은 method인 걸 한 눈에 알아보기 위함(가독성 측면)
    *   2. 부모의 method를 Overriding할 때 발생할 수 있는 실수를 방지하기 위함(실수방지 측면)
    * */
    public void SoundHorn() {
        System.out.println("에에엥에에에에에에엥에엥에에에엥~~~~!!!!");
    }
}
