package com.nuc.edu.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class RunAdvice implements MethodInterceptor {
    /**
     * 环绕通知一般不结合前置和后置通知使用
     *
     * methodInvocation：
     *         封装切点的方法对象和切点所在的类对象
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("--环绕通知-前--");

        Object proceed = methodInvocation.proceed();

        System.out.println("--环绕通知-后--");

        return proceed;
    }
}
