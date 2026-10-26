package com.ohgiraffers.section01.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void serviceMethods() {
    }
}
