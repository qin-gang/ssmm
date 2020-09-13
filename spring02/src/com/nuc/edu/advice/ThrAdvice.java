package com.nuc.edu.advice;

import org.springframework.aop.ThrowsAdvice;

public class ThrAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("--异常通知--");
    }
}
