package com.ohgiraffers.section01.list.dto;

public class BookDTO implements Comparable<BookDTO> {
    private String title;
    private int number;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(String title, int number, String author, int price) {
        this.title = title;
        this.number = number;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", number=" + number +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 필기.
    *  우리가 원하는 필드의 오름차순 또는 내림차순을 할 수 있다.
    *  필드가 n개면 총(n * 2) 가지의 정렬 기준을 가질 수 있다.(각각 asc or desc)
    *  정렬은 compreTo() method가 반환하는 int형의 부호에 따라 정해지게 되므로 오름차순과 내림차순은
    *  부모만 달리하면 된다.
    *  (해당 필드가 String일 경우 String의 compareTo() method를 활용)*/
    /* 설명. class에 정의된 method로 정렬을 하기 때문에 하나의 필드값에 대한 정렬만 가능하다 */
    @Override
    public int compareTo(BookDTO o) {

        /* 설명. 가격에 대한 오름차순 */
//        return this.price - o.getPrice();

        /* 설명. 가격에 대한 내림차순 */
//        return o.getPrice() - this.price;
//        return -(this.price - o.price);

        /* 설명. 책 제목에 대한 오름차순 */
//        return this.title.compareTo(o.getTitle()); // int compareTo와 마찬가지로 결국 반환하는 값은 int라 순서를 바꾸기만하면 내림차순 정렬이 된다
        return -this.title.compareTo(o.getTitle());
    }
}
