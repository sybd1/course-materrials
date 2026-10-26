package com.ohgiraffers.section03.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * ComponentScan
 * basPackage로 설정된 하위경로에 특정 어노테이션을 가지고 있는 클래스를 bean으로 등록한다.
 * 목적에 따라 세부 기능을 제공하는 @Controller, @service, @Repository, @Configuration등을 사용한다.
 * */
@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.common")
public class ContextConfiguration {
}
