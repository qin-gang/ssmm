package com.nuc.edu.controller;

import com.nuc.edu.pojo.Flower;
import com.nuc.edu.service.FlowerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/flowerSave")
public class FlowerInsertServlet extends HttpServlet {
    FlowerService flowers;

    @Override
    public void init() throws ServletException {
        ApplicationContext app= WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        flowers = app.getBean("flowers", FlowerService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        //接收页面数据
        String name=req.getParameter("name");

        String sprice = req.getParameter("price");
        int price=0;
        if (sprice!=null&&!"".equals(sprice)){
            price=Integer.parseInt(sprice);
        }

        String production=req.getParameter("production");

        //处理数据
        Flower flower=new Flower();
        flower.setName(name);
        flower.setPrice(price);
        flower.setProduction(production);
        int i = flowers.save(flower);

        //做出响应
        if (i>0){
            resp.sendRedirect(req.getContextPath()+"/findAllFlower");
        }else{
            req.setAttribute("error","添加花卉失败");
            req.getRequestDispatcher("/save.jsp").forward(req,resp);
        }

    }
}
