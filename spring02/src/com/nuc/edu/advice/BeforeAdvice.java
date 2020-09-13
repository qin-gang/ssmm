package com.nuc.edu.advice;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        /*
           method:获得切点的方法
           objects:参数
           o:切点所在的类
         */
        System.out.println(method+":"+objects[0]+":"+o);
        System.out.println("--方法的前置通知--");
    }
}
