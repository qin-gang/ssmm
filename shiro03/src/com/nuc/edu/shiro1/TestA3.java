package com.nuc.edu.shiro1;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

import java.util.Arrays;

public class TestA3 {
    public static void main(String[] args) {
        Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("zs","123");
        try {
            subject.login(token);
            if (subject.isAuthenticated()){
                System.out.println("登录成功");
            }
        }catch (IncorrectCredentialsException e){
            System.out.println("登录失败");
        }catch (UnknownAccountException e1){
            System.out.println("用户名不正确");
        }

        //授权的查询

        //基于角色的授权
        boolean flag = subject.hasRole("role1");
        System.out.println(flag);

        //判断是否具有多个角色
        boolean[] booleans = subject.hasRoles(Arrays.asList("role1", "role3"));
//        for (boolean b:booleans){
//            System.out.println(b);
//        }
        System.out.println("------------------------------------");
        //基于资源的授权
        boolean flag2 = subject.isPermitted("add");
        System.out.println(flag2);

    }
}
