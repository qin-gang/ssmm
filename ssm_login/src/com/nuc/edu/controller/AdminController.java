package com.nuc.edu.controller;

import com.nuc.edu.pojo.Admin;
import com.nuc.edu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("login.do")
    public String adminLogin(String uname, String pwd, HttpServletRequest req, Map<String,String> map){
        System.out.println("进入了控制单元");
        Admin admin = adminService.login(uname, pwd);
        if (admin!=null){
            return "forward:/success.jsp";
        }else{
           // req.setAttribute("error","用户名或密码错误");
            map.put("error","用户名或密码错误--强制");
            return "login.jsp";
        }

    }
}
