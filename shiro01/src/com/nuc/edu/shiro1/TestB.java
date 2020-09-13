package com.nuc.edu.shiro1;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class TestB {
    public static void main(String[] args) {

        Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro-jdbc.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("qg","123");
        try {
            subject.login(token);
            if (subject.isAuthenticated()){
                System.out.println("登录成功");
            }
        }catch (IncorrectCredentialsException e){
            //凭证错误
            System.out.println("登录失败");
        }catch (UnknownAccountException e1){
            System.out.println("用户名不正确");
        }

    }
}
