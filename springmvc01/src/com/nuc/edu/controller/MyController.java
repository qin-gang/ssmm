package com.nuc.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("abc")
    public String demo1(){
        //接收页面数据

        //数据处理
        System.out.println("进入了demo控制单元");

        //做出响应
        return "index.jsp";
    }
}
