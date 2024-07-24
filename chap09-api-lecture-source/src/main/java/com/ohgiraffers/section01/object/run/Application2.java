package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.dto.BookDTO;

public class Application2 {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO(1, "perfume", "Partrick", 5000);
        BookDTO book2 = new BookDTO(2, "perfume", "Partrick", 5000);

        System.out.println("두 인스턴스를 == 연산자로 비교: " + (book1 == book2));     // 객체가 지닌 값은 같으나 주소값이 다름 = 동일하지 않다.

        /* 설명. Object가 처음 물려주는 equals() method는 동일 비교용이다.(주소값 비교) */
        System.out.println("두 인스턴스를 .equals()로 비교: " + (book1.equals(book2)));    //    equals는 Object가 물려진 method라 바로 사용 가능
        System.out.println("book1의 hashCode: " + book1.hashCode());
        System.out.println("book2의 hashCode: " + book2.hashCode());
    }
}
