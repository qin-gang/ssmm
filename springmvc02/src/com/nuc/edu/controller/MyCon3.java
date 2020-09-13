package com.nuc.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCon3 {

    @RequestMapping("/{path}")
    public String demo(@PathVariable String path){
        return path;
    }

    /**
     * demo02  ----@RequestMapping("demo02")  等于 demo02
     *    如果没有 ---走 @RequestMapping("/{path}")
     *        在返回值时会走自定义视图解析器，如果不想要走视图解析器
     *        就需要书写具体的跳转代码  forward:index.jsp
     *        默认走自定义视图解析器
     *
     */
    @RequestMapping("demo02")
    public String demo2(){
        System.out.println("进入demo2");
        return "forward:index.jsp";
    }

    /*@RequestMapping("delete")
    public String demo1(){
        return "delete";
    }

    @RequestMapping("update")
    public String demo2(){
        return "update";
    }

    @RequestMapping("show")
    public String demo3(){
        return "show";
    }*/
}
