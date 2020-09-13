package com.nuc.edu.shiro2;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class TestB1 {
    public static void main(String[] args) {
        Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro-jdbc2.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("qg","123");
        try {
            subject.login(token);
            if (subject.isAuthenticated()){
                System.out.println("登录成功");
                //授权的校验
                boolean flag = subject.isPermitted("findUser");
                System.out.println("是否存在该权限："+flag);
            }
        }catch (IncorrectCredentialsException e){
            System.out.println("登录失败");
        }catch (UnknownAccountException e1){
            System.out.println("用户名不正确");
        }

    }
}
