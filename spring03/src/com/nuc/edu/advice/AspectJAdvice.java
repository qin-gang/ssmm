package com.nuc.edu.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJAdvice {
    //前置通知方法
    @Before("execution(* com.nuc.edu.pojo.User.uu())")
    public void beforeAd(){
        System.out.println("前置通知-------");
    }

    //后置通知方法
    @After("execution(* com.nuc.edu.pojo.User.uu())")
    public void afterAd(){
        System.out.println("后置通知-------");
    }

    //环绕通知方法
    @Around("execution(* com.nuc.edu.pojo.User.uu())")
    public Object roundAd(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知-------前");
        Object o = point.proceed();
        System.out.println("环绕通知-------后");
        return o;
    }

    //异常通知方法

    public void thrAd(){
        System.out.println("异常通知-------");
    }
}
