package com.nuc.edu.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class AspectJAdvice {
    //前置通知方法
    public void beforeAd(){
        System.out.println("前置通知-------");
    }

    //后置通知方法
    public void afterAd(){
        System.out.println("后置通知-------");
    }

    //环绕通知方法
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
