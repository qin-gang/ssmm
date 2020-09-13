package com.nuc.edu.proxy3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyMethodInv implements MethodInterceptor {
    //产生代理类
    public Object getProxy(){
        Enhancer enhancer = new Enhancer();

        //类似于原来的接口
        enhancer.setSuperclass(FD.class);

        enhancer.setCallback(this);

        //使整个设置的内容生效
        Object o = enhancer.create();

        return o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        /**
         * o:被代理对象
         * method:被代理对象的方法
         * objects:参数
         * methodProxy:代理对象中的方法
         */
        System.out.println("收取推荐费100元");

        //调用真正房东的zf()
        Object o1 = methodProxy.invokeSuper(o, objects);

        System.out.println("收取管理费500元");

        return o1;
    }
}
