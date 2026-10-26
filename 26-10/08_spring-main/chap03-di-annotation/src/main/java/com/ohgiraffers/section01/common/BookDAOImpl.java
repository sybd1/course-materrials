package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;

/* @Component의 세분화 어노테이션의 한 종류로 DAO 타입의 객체에 사용한다.
 * DAO계층의 인터페이스를 상속받는 클래스는 impl을 붙이는게 일반적이다. */
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

    private final Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new LinkedHashMap<>();
        bookList.put(1, new BookDTO(1, 123456, "자바의 정석", "남궁성", "도우출판", new Date()));
        bookList.put(2, new BookDTO(2, 654321, "칭찬은 고래도 춤추게 한다", "고래", "고래출판", new Date()));
    }

    @Override
    /* vaules() : 목록들만 컬렉션 타입으로 반환, 어레이리스트 생성자에 넣으면 어레이리스트 타입으로 반환 */
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }

}
