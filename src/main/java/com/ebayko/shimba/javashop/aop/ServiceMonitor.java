package com.ebayko.shimba.javashop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// aopexam - monitor
// Advice + joinpoint + pointcut
@Aspect
@Component
public class ServiceMonitor {

    // @Before, @After, @AfterThrowing 으로도 쓸 수 있음..
    @AfterReturning("execution(* com.ebayko..*Service.*(..))") //문법대로 JoinPoint 작성
    public void logServiceAccess(JoinPoint joinPoint){
        System.out.println("----");
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getTarget().getClass().getName());
        System.out.println("ex :");
        System.out.println("----");
    }
}
