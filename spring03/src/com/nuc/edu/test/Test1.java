package com.nuc.edu.test;

import com.nuc.edu.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = app.getBean("stu", Student.class);
        System.out.println(stu);

    }
}
