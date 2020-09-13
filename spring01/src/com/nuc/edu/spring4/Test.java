package com.nuc.edu.spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext2.xml");
        //Student stu = app.getBean("stu", Student.class);
        User us = app.getBean("us", User.class);
        System.out.println(us);
    }
}
