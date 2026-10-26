package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        // bean의 id와 기대하는 타입을 함께 전달하여 가져온다
        MemberDTO member = context.getBean("member", MemberDTO.class);
        System.out.println(member);
    }
}
