package com.nuc.edu.test;

        import com.nuc.edu.pojo.User;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        //解析xml
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获得User对象
        User us = app.getBean("us", User.class);
        //调用方法
        us.b("sxt");
    }

}
