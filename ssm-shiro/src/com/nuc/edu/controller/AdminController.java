package com.nuc.edu.controller;

import com.nuc.edu.pojo.Admin;
import com.nuc.edu.service.AdminService;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
   //查看具体的异常信息，获得异常的信息名称
   @RequestMapping("login")
   public String login(HttpServletRequest req){
      Object ex = req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
      if (UnknownAccountException.class.getName().equals(ex)){
         req.setAttribute("msg","用户名不正确");
      }else if(IncorrectCredentialsException.class.getName().equals(ex)){
         req.setAttribute("msg","密码不正确");
      }else{
         req.setAttribute("msg","未知异常");
      }
      return "/error.jsp";
   }
}
