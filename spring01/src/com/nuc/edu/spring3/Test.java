package com.nuc.edu.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //解析xml
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = app.getBean("be", People.class);
        people.eat();


    }
}
