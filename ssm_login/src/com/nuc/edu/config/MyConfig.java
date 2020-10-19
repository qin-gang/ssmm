package com.nuc.edu.config;

import com.nuc.edu.controller.AdminController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    /*@Bean     //bean的id默认为方法名
    @Qualifier("suibianController")         //指定bean对象的方法名
    public AdminController userController(){
        return new AdminController();
    }*/
}
