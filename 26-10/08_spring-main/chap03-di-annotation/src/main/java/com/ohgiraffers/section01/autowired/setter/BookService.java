package com.ohgiraffers.section01.autowired.setter;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* @Service : @Component의 세분화 어노테이션의 한 종류로 Service 계층에서 사용한다. */
@Service("bookServiceSetter")
public class BookService {

    private BookDAO bookDAO;

    /* BookDAO 타입의 빈 객체를 setter에 자동으로 주입해준다. */
    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks(){

        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {

        return bookDAO.selectOneBook(sequence);
    }
}
