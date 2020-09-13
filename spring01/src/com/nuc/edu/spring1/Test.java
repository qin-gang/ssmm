package com.nuc.edu.spring1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //【1】解析xml文件
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");

        //【3】获得对象
        Student stu = app.getBean("stu", Student.class);

        //【3】调用方法
        stu.eat();
    }
}
