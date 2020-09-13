package com.nuc.edu.controller;

import com.nuc.edu.pojo.Flower;
import com.nuc.edu.service.FlowerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findAllFlower")
public class FlowerFindAllServlet extends HttpServlet {
    FlowerService flowers;

    @Override
    public void init() throws ServletException {
        /*String path=this.getServletContext().getInitParameter("abc");
        ApplicationContext app=new ClassPathXmlApplicationContext(path);*/

        ApplicationContext app= WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        flowers = app.getBean("flowers", FlowerService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收页面数据

        //数据处理
        List<Flower> floList = flowers.findAll();

        //做出响应
        req.setAttribute("floList",floList);
        req.getRequestDispatcher("/findAll.jsp").forward(req,resp);

    }
}
