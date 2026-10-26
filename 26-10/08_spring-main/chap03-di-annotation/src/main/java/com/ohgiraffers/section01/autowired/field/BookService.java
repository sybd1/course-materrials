package com.ohgiraffers.section01.autowired.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* @Service : @Component의 세분화 어노테이션의 한 종류로 Service 계층에서 사용한다. */
@Service("bookServiceField")
public class BookService {

    /* BookDAO 타입의 빈 객체를 이 프로퍼티에 자동으로 주입해준다.
    * 의존관계에 있는 BookDAO라는 타입과 일치하는 빈이 있다면 넣어줘~ */
    @Autowired
    private BookDAO bookDAO;

    /* 도서 목록 전체 조회 */
    public List<BookDTO> selectAllBooks(){

        return bookDAO.selectBookList();
    }

    /* 도서 번호로 도서 조회 */
    public BookDTO searchBookBySequence(int sequence) {

        return bookDAO.selectOneBook(sequence);
    }
}
