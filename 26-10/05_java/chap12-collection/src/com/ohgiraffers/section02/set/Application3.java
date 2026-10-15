package com.ohgiraffers.section02.set;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /*
         * TreeSet
         * - '중복 불가'의 특징과 함께, 요소를 저장할 때마다 비교 기준에 따라 요소를 정렬해서 보관
         * */

        /*
         * 요소가 Comparable을 구현해 기본 정렬 기준을 제공하거나,
         * TreeSet을 만들 때 별도의 Comparator를 전달해야 한다.
         * String 클래스와 Integer 같은 클래스는 이미 Comparable을 구현하여 자동 정렬된다.
         * */

        TreeSet<String> tset = new TreeSet<>();

        tset.add("java");
        tset.add("html");
        tset.add("mysql");
        tset.add("css");
        tset.add("java");

        System.out.println(tset);

        TreeSet<BookDTO> bookSet = new TreeSet<>();
        bookSet.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookSet.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookSet.add(new BookDTO(4, "동의보감", "허준", 40000));
        bookSet.add(new BookDTO(2, "다른 제목", "다른 저자", 10000));
        // BookDTO의 compareTo()는 number만 비교한다. number가 2로 같으므로 중복으로 판단된다.

        System.out.println("BookDTO TreeSet 결과 : ");
        for (BookDTO book : bookSet) {
            System.out.println(book);
        }

        /* TreeSet을 활용한 로또 번호 생성기 */
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6) {
            lotto.add((int) ((Math.random() * 45) + 1));
        }
        System.out.println(lotto);
    }
}
