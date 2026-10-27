package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ohgiraffers.section01.aop")
@EnableAspectJAutoProxy
public class ContextConfiguration {
}
