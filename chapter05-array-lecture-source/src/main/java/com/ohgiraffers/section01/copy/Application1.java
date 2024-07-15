package com.ohgiraffers.section01.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */
        /* 필기.
        *   배열의 복사에는 크게 두가지 개념이 있다.
        *   1. 얕은 복사(shallow copy): stack의 주소 값만 복사
        *   2. 깊은 복사(deep copy): heap의 배열에 저장된 값을 복사
        * */

        int[] originArr = {1, 2, 3};
        int[] copyArr = originArr;  // 나는 하나지만 부른 이름이 여러 개인 경우, 매개 변수가 메서드에 호출될 때 이 경우다.
        /* 설명. orgiinArr[0]  = copyArr[0], 이 칸을 지칭하는 이름이 2개가 되었다. */

        /* 설명. 참조 주소값 복사(얕은 복사) */
        test(originArr);  // int[] arr = originArr을 한 것. 전달 인자로 전달한 건 값이 아니라 주소값을 전달한 것이다.

        /* 설명. 두 배열은 이름만 다를 뿐 같은 배열을 가리키기 떄문에 copyArr을 값을 바꿔도 두 배열 모두 바뀐다. */
        System.out.println(Arrays.toString(copyArr));
        copyArr[2] = 100;
        System.out.println(Arrays.toString(originArr));
    }

    public static void test(int[] arr) {

    }
}
