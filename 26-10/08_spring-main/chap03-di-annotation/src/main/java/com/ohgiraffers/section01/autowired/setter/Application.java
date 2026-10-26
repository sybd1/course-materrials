package com.ohgiraffers.section01.autowired.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* AnnotationConfigApplicationContext 생성자에 basePackages 문자열을 전달하며 ApplicationContext 생성한다.  */
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceSetter", BookService.class);

        /* 전체 도서 목록 조회 후 출력 확인 */
        bookService.selectAllBooks().forEach(System.out::println);

        /* 도서번호로 검색 후 출력 확인*/
        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }
}
