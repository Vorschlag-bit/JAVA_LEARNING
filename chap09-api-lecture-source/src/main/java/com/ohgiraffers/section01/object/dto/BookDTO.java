package com.ohgiraffers.section01.object.dto;

import java.util.Objects;

public class BookDTO {
    private int number;
    private String title;
    private String author;
    private  int price;

    public BookDTO() {
    }

    public BookDTO(int i, String perfume, String partrick, int i1){
        this.number = i;
        this.title = perfume;
        this.author = partrick;
        this.price = i1;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }


//    @Override
//    public boolean equals(Object obj) {
//
//        /* 설명. 책제목,작가,가격이 같으면(우리의 '동등' 기준) true가 나오도록 equals method를 재정의 */
//        return this.title.equals(((BookDTO) obj).title) &&
//                this.author.equals(((BookDTO) obj).author) &&
//                this.price == ((BookDTO) obj).price;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
