package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(3, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(2, "동의보감", "허준", 40000));

        System.out.println(bookList);

        Collections.sort(bookList);
        System.out.println("bookList = " + bookList);

        for (BookDTO book : bookList) {
            System.out.println(book);
        }
        /*
         * 기본값과 다른 기준으로 정렬
         * 별도의 Comparator 구현한 구현체인 AscendingPrice를 전달한다.
         * */
        bookList.sort(new AscendingPrice());
        System.out.println("가격 오름차순 정렬");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }
}
