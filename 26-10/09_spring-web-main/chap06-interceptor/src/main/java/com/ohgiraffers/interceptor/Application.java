package com.ohgiraffers.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /*
    * 인터셉터
    * 클라이언트의 HTTP요청이 Controller에 도착하기 전과
    * Controller 실행이 끝난 후 공통 로직을 처리하는 Spring MVC 기능이다.
    *
    * preHandle()
    * - Controller 실행 전에 호출
    * - true를 반환하면 다음단계로 진행, false를 반환하면 요청 처리 중단
    *
    * postHandle()
    * - Controller가 정상적으로 실행된 후 호출
    * - 예외가 발생하면 호출되지 않을 수 있다
    *
    * afterCompletion()
    * - 요청 처리가 모두 끝난 후 호출
    * - 예외 발생 여부와 관계없이 마무리 작업에 활용
    * */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
