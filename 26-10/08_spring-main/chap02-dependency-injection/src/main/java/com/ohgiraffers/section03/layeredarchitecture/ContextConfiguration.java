package com.ohgiraffers.section03.layeredarchitecture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemoRepository memoRepository() {
        return new MemoryMemoRepository();
    }

    @Bean
    public MemoService memoService() {
        return new MemoService(memoRepository());
    }

    @Bean
    public MemoController memoController() {
        return new MemoController(memoService());
    }
}
