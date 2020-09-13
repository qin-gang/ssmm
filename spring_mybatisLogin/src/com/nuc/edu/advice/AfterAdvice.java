package com.nuc.edu.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Date;

public class AfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
          if (o!=null){
              //证明用户是否登陆成功
              String uname= (String) objects[0];
              //获得时间
              String s = new Date().toLocaleString();
              System.out.println("用户："+uname+"在："+s+"登陆成功该系统");
          }
    }
}
