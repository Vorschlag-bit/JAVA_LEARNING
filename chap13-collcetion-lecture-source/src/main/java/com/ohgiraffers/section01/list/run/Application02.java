package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. ArrayList에서 관리되는 자료형의 정렬 기준을 이용할 수 있다. */
        /* 목차. 1. Comparable 인터페이스 구현 방법 활용 */
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO("honggildong", 1, "Mr.h", 20000));
        bookList.add(new BookDTO("Pefume", 2, "Sueskind", 10000));
        bookList.add(new BookDTO("OldmanandSea", 3, "Hemingway", 30000));
        bookList.add(new BookDTO("Whitebeard", 4, "Ismael", 20000));
        bookList.add(new BookDTO("Once", 5, "Knuon", 20000));


        /* 설명. Collections.sort를 활용한 정렬(Comparable or Comparator) */
//        Collections.sort(bookList);   <- Comparable 방식
        for(BookDTO book : bookList){
            System.out.println(book);
        }

        Collections.sort(bookList, new AscendingPrice());   // Comparator 방식

        /* 설명. ArrayList가 제공하는 sort를 사용할 수도 있다. (다만 Comparator 기준만 가능) */
        bookList.sort(new AscendingPrice()); // 이것도 가능! Comparator 방식

        System.out.println("bookList = " + bookList);
    }
}
