package com.nuc.edu.controller;

import com.nuc.edu.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


@Controller
public class MyContro2 {
    /**
     * /demo05/www/123
     *resetful数据传输格式：比较安全
     */
    @RequestMapping("/demo05/{uname}/{pwd}")
    public String demo05(@PathVariable String uname,@PathVariable String pwd){
        System.out.println(uname+"--"+pwd);
        return "/success.jsp";
    }


    /**
     *参数接收四：接收字符串或字符数组
     *    sql Date:只能接收年月日,继承util Date
     *    util Date:还能接收时分秒
     *       注意：必须用,@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
     */
    @RequestMapping("demo04")
    public String demo04(String[] hobby,@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") Date birthday){
        System.out.println(hobby[0]+"--"+birthday);
        return "success.jsp";
    }



    /**
     *参数直接使用对象接收三：
     *      使用对象接收注意：
     *            现在表单中的name属性必须和接收参数中的实体属性一致
     */
    @RequestMapping("demo03")
    public String demo03(User user){
        System.out.println(user);
        return "success.jsp";
    }


    /**
     * 参数接收方式二：
     *      需要注意：后台形参名和前台form表单中的name值必须一样
     *      400：数据类型转化处理错误！！！！
     */
    @RequestMapping("demo02")
    public String demo02(String uname,int age){
        System.out.println(uname+"--"+age);
        return "success.jsp";
    }

    /**
     * 参数获得方式一：内置对象直接当作参数进行传递过来直接使用
     * @param request
     * @return
     */
    @RequestMapping("demo01")
    public String demo01(HttpServletRequest request){
        String uname = request.getParameter("uname");
        System.out.println(uname);
        return "success.jsp";
    }
}
