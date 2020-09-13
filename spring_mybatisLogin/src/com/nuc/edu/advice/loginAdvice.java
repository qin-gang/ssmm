package com.nuc.edu.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class loginAdvice {

    @Before(value = "execution(* com.nuc.edu.service.imp.LoginServiceImpl.*(..))")
    public void before1(){
        System.out.println("before-----------");
    }


}
