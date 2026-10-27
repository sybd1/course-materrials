package com.ohgiraffers.section02.initdestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    /* Bean 생성 후 openShop(), Container 종료 전 closeShop()을 호출하도록 지정. */
    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
    public Owner owner() {
        return new Owner();
    }
}
