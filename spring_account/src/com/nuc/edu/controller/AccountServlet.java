package com.nuc.edu.controller;

import com.nuc.edu.pojo.Account;
import com.nuc.edu.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/account")
public class AccountServlet extends HttpServlet {

    AccountService accs;

    @Override
    public void init() throws ServletException {
        ApplicationContext app= WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        accs = app.getBean("accs", AccountService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if ("checkUser".equals(method)){
            checkUser(req,resp);
        }else if ("inOutMoney".equals(method)){
            inOutMoney(req,resp);
        }

    }

     protected void inOutMoney(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String cno = req.getParameter("cno");
         String money = req.getParameter("money");
         String cno2 = req.getParameter("cno2");
         int i = accs.inOutMoney(cno2, cno, money);
         if (i>0){
             resp.sendRedirect(req.getContextPath()+"/success.jsp");
         }else{
             req.setAttribute("error","转账失败");
             req.getRequestDispatcher("/account.jsp").forward(req,resp);
         }


     }


     protected void checkUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //接受页面数据
        String cno = req.getParameter("cno");
        String pwd = req.getParameter("pwd");
        String money = req.getParameter("money");
        System.out.println(cno+":"+pwd);
        //数据的处理
        Account ac = accs.findOne(cno, pwd, money);
        //System.out.println(ac.getCno()+":"+ac.getPwd());
        //做出响应
        if (ac!=null){
            resp.getWriter().println(true);
        } else {
            System.out.println("---false---");
            resp.getWriter().println(false);
        }
    }
}
