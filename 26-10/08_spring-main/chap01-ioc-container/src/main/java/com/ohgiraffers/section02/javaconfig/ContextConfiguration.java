package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 해당 클래스가 빈을 생성하는 클래스임을 표기한다. */
@Configuration("configurationSection02")
public class ContextConfiguration {

    /* @Bean: 해당 메서드의 반환 값을 스프링 컨테이너에 bean으로 등록한다. */
    @Bean(name="member")
    public MemberDTO getMember() {
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }
}
