package com.nuc.edu.controller;

import com.nuc.edu.pojo.Email;
import com.nuc.edu.pojo.User;
import com.nuc.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("EmailCon")
public class EmailController {
    @Autowired
    UserService userService;

    @RequestMapping("send")
    public String sendEmail(Email email, MultipartFile fi,HttpSession session) throws IOException {
        email.setFilename(fi.getOriginalFilename());
        Date date=new Date();
        java.sql.Date da=new java.sql.Date(new Date().getTime());
        email.setEdate(da);
        User user = (User)session.getAttribute("user");
        email.setSendid(user.getUid());

        int i = userService.sendEmai(email);
        fi.transferTo(new File("D:/img/"+fi.getOriginalFilename()));

        if (i>0){
            return "redirect:/success.jsp";
        }else {
            return "forward:/emailSend.jsp";
        }

    }

    @RequestMapping("findEmail")
    public String findMoreEmail(HttpSession session, HttpServletRequest req){
        //接收页面数据
        User user = (User)session.getAttribute("user");
        //数据处理
        List<Email> list = userService.findMore(user.getUid());
        //做出响应
        req.setAttribute("list",list);
        return "forward:/main.jsp";
    }


}
