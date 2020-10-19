package com.nuc.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @Pointcut("execution(* com.nuc.edu.service.imp.*.*(..))")
    public void joinmethod(){}

    @Before("joinmethod()")
    public void beforeAspect(JoinPoint joinPoint){
        System.out.println();
    }
}
