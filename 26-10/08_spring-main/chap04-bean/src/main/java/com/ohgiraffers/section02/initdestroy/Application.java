package com.ohgiraffers.section02.initdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        // close()를 위해 구현체로 했다고 함???
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        System.out.println("영업 중입니다.");

        context.close();
    }
}
