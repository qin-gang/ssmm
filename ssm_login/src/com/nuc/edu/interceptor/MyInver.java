package com.nuc.edu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class MyInver implements HandlerInterceptor {
    /*
      *执行时间：在进入控制单元之前执行
      *      返回值为true  就继续执行后续的方法
      *      返回值为false  就不再执行后续的方法
      *      o-将要执行控制单元中的方法对象
      *         作用1、进行方法中一些预处理  -----例如：中文乱码  req.setCharacterEncoding("utf-8");
      *         作用2、进行页面的拦截     ----例如 模块未完成  resp.sendRedirect("/ssm_login/wh.jsp");
     */
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object o) throws Exception {

        //请求方法中的中文乱码设置
        req.setCharacterEncoding("utf-8");
        System.out.println(o);
        System.out.println("preHandle");
        return true;
    }

    /*
     *   执行时间：在数据处理之后执行
     *      o:控制单元方法
     *      modelAndView:视图模型对象
     *            作用1、用于控制单元中模块的测试  ----modelAndView.setViewName("redirect:/success2.jsp");
     *            作用2、恶意字的替换    ---直接使用req的底层是map集合表示数据
     */
    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object o, ModelAndView modelAndView) throws Exception {
        //作用2、恶意字符替换
        Map<String, Object> map = modelAndView.getModel();
        String msg =(String) map.get("error");
        if (msg.contains("强制")){
            //all----:  登陆失败----**
            String all = msg.replaceAll("强制", "**");
            map.put("error",all);
        }
        System.out.println("postHandle");
    }

    /**
     * 执行时机：在进行页面渲染的时候执行
     *      作用1、主要就是页面渲染操作和垃圾回收处理
     *
     * */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");

    }
}
