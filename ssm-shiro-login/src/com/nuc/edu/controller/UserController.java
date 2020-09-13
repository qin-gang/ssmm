package com.nuc.edu.controller;

import com.nuc.edu.pojo.User;
import com.nuc.edu.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAll(){
        List<User> userList = userService.findAll();
        Map<String,Object> map=new HashedMap();
        map.put("userList",userList);
        System.out.println(userList);
        return userList;
    }



    @RequestMapping("saveUser")
    public String addUser(String uname,String upwd,Integer rid){
        User user=new User();
        user.setUname(uname);
        Md5Hash savePwd=new Md5Hash(upwd,uname,2);
        String pwd=new String(String.valueOf(savePwd));
        user.setUpwd(pwd);
        user.setSalt(uname);
        user.setRealPwd(upwd);
        user.setRid(rid);
        int i = userService.addUser(user);
        return "/findUser";
    }


    @RequestMapping("showMenu")
    public String showMenu(HttpServletRequest req){
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        System.out.println(user.getMenuList());
        req.setAttribute("menuList",user.getMenuList());
        return "/success";
    }

    @RequestMapping("userLogin")
    public String login(HttpServletRequest req,String uname){
        System.out.println(uname);
        Object ex = req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
        if (UnknownAccountException.class.getName().equals(ex)){
            req.setAttribute("msg","用户名不正确");
        }else if (IncorrectCredentialsException.class.getName().equals(ex)){
            req.setAttribute("msg","密码错误");
        }else{
            req.setAttribute("msg","未知异常");
        }
        return "/error";
    }
}
