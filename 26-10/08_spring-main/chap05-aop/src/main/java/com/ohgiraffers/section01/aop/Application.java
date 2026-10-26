package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberService memberService = context.getBean(MemberService.class);

        System.out.println("=============== selectMembers ===============");
        System.out.println(memberService.selectMembers());

        System.out.println("=============== selectMember(1L) ===============");
        System.out.println(memberService.selectMember(1L));

        System.out.println("=============== selectMember(3L) ===============");
        try {
            memberService.selectMember(3L);
        } catch (IllegalArgumentException e) {
            System.out.println("Application에서 예외 처리 : " + e.getMessage());
        }

        context.close();
    }
}
