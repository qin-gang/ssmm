package com.nuc.edu.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {

        //解析xml
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获得对象
        Student stu3 = app.getBean("stu3", Student.class);
        System.out.println(stu3.toString());
    }
}
