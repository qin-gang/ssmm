package com.nuc.edu.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class TestDemo {
    public static void main(String[] args) {


        //使用MD5加密
        Md5Hash md5Hash=new Md5Hash("1111");
        System.out.println("1111====>"+md5Hash);

        //加盐操作
        md5Hash=new Md5Hash("1111","秦刚");
        System.out.println("1111 salt==>"+md5Hash);

        //迭代加盐
        md5Hash=new Md5Hash("123","qg",2);
        System.out.println("1111 2salt==>"+md5Hash);
    }
}
