package com.nuc.edu.controller;

import com.nuc.edu.pojo.User;
import com.nuc.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("login")
    public String login(String uname, String pwd, HttpSession session){
        User user = userService.login(uname, pwd);
        if (user!=null){
            session.setAttribute("user",user);
            return "forward:/EmailCon/findEmail";
        }else{
            return "forward:/login.jsp";
        }

    }
}
