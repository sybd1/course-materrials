package com.ohgiraffers.section03.layeredarchitecture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemoController memoController = context.getBean(MemoController.class);

        System.out.println(memoController.findMemos());
        System.out.println(memoController.createMemo("의존 객체를 생성자로 전달"));
    }
}
