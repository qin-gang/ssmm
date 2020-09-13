package com.nuc.edu.filter;

import javax.servlet.*;
import java.io.IOException;
//过滤器只能解决中文乱码问题
public class EncFilter implements Filter {
    String code;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //读取初始化参数
        code = filterConfig.getInitParameter("code");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        //1、到达目标资源之前的预处理

        //2、执行目标资源方法或者下一个过滤器
           chain.doFilter(req, resp);
        //3、离开服务器之前的处理操作
    }

    @Override
    public void destroy() {

    }
}
