package com.ohgiraffers.section01.autowired.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* AnnotationConfigApplicationContext 생성자에 basePackages 문자열을 전달하며 ApplicationContext 생성한다.  */
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceField", BookService.class);

        /* 전체 도서 목록 조회 후 출력 확인
        forEach 메소드는 함수형 프로그래밍 스타일을 지원하는데, 이는 함수를 인자로 받아서 그 함수를 반복적으로 실행하는 것을 의미합니다.
        * forEach(System.out::println)은 컬렉션의 각 요소를 System.out.println 메소드를 통해 출력하는 것입니다.*/
        bookService.selectAllBooks().forEach(System.out::println);

        /* 도서번호로 검색 후 출력 확인*/
        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }
}
