package com.nuc.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("MyCon2")
public class MyCon2 {

    @RequestMapping("demo4")
    public ModelAndView demo4(){
        ModelAndView modelAndView=new ModelAndView();
        //转发一
        modelAndView.setViewName("forward:/index.jsp");
        //重定向一
        modelAndView.setViewName("redirect:/index.jsp");
        //转发二
        modelAndView.setView(new InternalResourceView("/index.jsp"));
        //重定向二
        modelAndView.setView(new RedirectView("/springmvc02/index.jsp"));
        return modelAndView;
    }

    @RequestMapping("demo3")
    //底层原理
    public View demo3(){
        //转发的跳转
        //View v=new InternalResourceView("/index.jsp");

        //重定向
        View v=new RedirectView("/springmvc02/index.jsp");
        return v;
    }


    /**
     * 重定向：
     *      return "redirect:/index.jsp";
     *      相对路径：相对于当前路径
     *      根路径：
     *      绝对路径：支持
     */
    @RequestMapping("demo2")
    public String demo02(){
        System.out.println("重定向的跳转");
        return "redirect:http://www.baidu.com";
       // return "redirect:/index.jsp";
    }


    /**
         return "index.jsp":这种方式默认的是请求转发
         return "forward:/index.jsp" ：全写方式
     *      路径支持：
     *          相对路径：相对于当前浏览器的地址
     *          跟路径：  /   代表项目根目录   --使用
     *          绝对路径： 不支持---最大范围就是当前项目
     */
    @RequestMapping("demo1")
    public String demo01(){
        return "/index.jsp";
    }


}
