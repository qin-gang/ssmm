package com.nuc.edu.test;

import com.nuc.edu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext2.xml");
        User us = app.getBean("us", User.class);
        us.uu();
    }
}
