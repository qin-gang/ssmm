package com.nuc.edu.controller;

import com.nuc.edu.pojo.Admin;
import com.nuc.edu.service.AdminService;
import com.nuc.edu.service.Impl.AdminServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {

    AdminService admins=null;

    @Override
    public void init() throws ServletException {
        String path = this.getServletContext().getInitParameter("app");
        ApplicationContext app=new ClassPathXmlApplicationContext(path);
        admins = app.getBean("admins", AdminService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1、接受页面数据
        String uname = req.getParameter("uname");
        String pwd =req.getParameter("pwd");
        System.out.println(uname+":"+pwd);

        //2、调用业务层处理
        Admin admin = admins.login(uname, pwd);

        //3、做出响应
        if(admin!=null){
            resp.sendRedirect(req.getContextPath()+"/success.jsp");
        }else{
            req.setAttribute("error","登陆失败");
            req.getRequestDispatcher("/login1.jsp").forward(req,resp);
        }

    }
}
