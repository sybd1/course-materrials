package com.ohgiraffers.section01.list.dto;

public class BookDTO implements Comparable<BookDTO> {

    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO() {

    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    public int compareTo(BookDTO o) {
        /* 정렬기준: 책 번호(number) 기준으로 오름차순으로 정하겠다.
         * - 현재 객체(this)의 number가 o의 number보다 작으면 -> 음수 반환(자리 유지)
         * - 현재 객체(this)의 number가 o의 number보다 크면 -> 양수 반환(자리 바꿈)
         * - 두 객체의 number가 같으면 -> 0 반환(자리 유지)
         * */
        return Integer.compare(this.number, o.getNumber());

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


}
