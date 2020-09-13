package com.nuc.edu.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//在这个类中书写动态产生代理对象的方法
public class MyInv implements InvocationHandler {

    LetRoom letRoom=null;

    public void setLetRoom(LetRoom letRoom) {
        this.letRoom = letRoom;
    }

    //执行该方法就会动态产生代理对象
    public Object getProxy(){
        /*
          参数一：保证类型是ClassLoader
          参数二：接口的class数组
          参数三：参数类型是InvocationHandler即可
         */
        Object o = Proxy.newProxyInstance(MyInv.class.getClassLoader(), new Class[]{LetRoom.class}, this);
        return o;
    }

    //类似于书写中介中的zf()方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("收取推荐费100RMB");

        //调用了指定房东方法的zf
        Object invoke = method.invoke(letRoom, args);

        System.out.println("收取管理费500RMB");
        return invoke;
    }
}
