package com.nuc.edu.controller;

import com.google.gson.Gson;
import com.nuc.edu.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MyCon {

    /**
     *Springmvc 结合Ajax的使用
     *      注意：
     *          A、方法的返回值可以直接是对象或者集合，需要在方法上添加@ResponseBody注解
     *          B、响应给前台的数据直接是json对象
     *
     */
    @RequestMapping(value = "demo2",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Student demo2(String name){
        //接受页面数据

        //数据处理
        System.out.println(name);
        Student student=new Student(15,"李四","女");
        //做出响应
        return student;
    }



    /**
     *使用传统方式进行Ajax响应
     */
    @RequestMapping("ajax1")
    public void ajax1(String name, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        //接受页面数据

        //数据处理
        Student student=new Student(18,"张三","男");

        //做出响应
        String json = new Gson().toJson(student);
        resp.getWriter().println(json);

    }
}
