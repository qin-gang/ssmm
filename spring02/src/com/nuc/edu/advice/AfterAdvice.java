package com.nuc.edu.advice;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        /**
         * o:切点的的返回值类型
         * method:切点的方法对象
         * objects:参数
         * o1:切点所在的类
         */
        System.out.println(o+":"+method+":"+objects[0]+":"+o1);
        System.out.println("--方法的后置通知--");
    }
}
