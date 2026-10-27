package com.ohgiraffers.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/* 이 클래스가 AOP의 적용 위치와 실행할 동작을 정의한다는 뜻 */
@Aspect
@Component
public class LoggingAspect {

    /*
     * @Pointcut: 공통 기능을 적용할 메서드의 조건을 이름(serviceMethods) 붙여 보관.
     * */
    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void serviceMethods() {
    }

    @Before("serviceMethods()")
    // Advice: 실행할 공통 기능
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[Before]" + joinPoint.getSignature().getName()
                + "args=" + Arrays.toString(joinPoint.getArgs()));
    }

    // returning = "result" -> 원래 메서드가 반환한 값을 Adive의 result 매게변수로 받겠다는 뜻
    // 속성에 적은 이름과 매개변수 이름이 같아야 한다.
    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("[AfterReturning] " + joinPoint.getSignature().getName()
                + "result=" + result);
    }

    // throwing = 'exception": 대상 메서드가 밖으로 던진 예외를 Advice의 exception 매개변수로 받겠다는 뜻
    @AfterThrowing(pointcut = "serviceMethods()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        System.out.println("[AfterThrowing] " + joinPoint.getSignature().getName()
                + "message=" + exception.getMessage());
    }

    @After("serviceMethods()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[After] " + joinPoint.getSignature().getName());
    }

    /* 대상 메서드의 실행 전후를 감싸 실행 시간 측정 */
    @Around("serviceMethods()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();

        try {
            // proceed()를 호출해야 원래 Service 메서드가 실제로 실행된다.
            joinPoint.proceed();
        } finally {
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("[Around] elapsed = " + elapsedTime);
        }
        return null;
    }
}
