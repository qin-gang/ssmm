package com.nuc.edu.controller;

import com.nuc.edu.pojo.Admin;
import com.nuc.edu.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    LoginService admins;

    @Override
    public void init() throws ServletException {
        String path=this.getServletContext().getInitParameter("abc");
        ApplicationContext app=new ClassPathXmlApplicationContext(path);
        admins = app.getBean("admins", LoginService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收网页信息
        String uname = req.getParameter("uname");
        String pwd= req.getParameter("pwd");
        //信息处理
        Admin admin = admins.findAdmin(uname, pwd);
        //响应结果
        if (admin!=null){
            resp.sendRedirect(req.getContextPath()+"/success.jsp");
        }else{
            req.setAttribute("error","用户名或密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
