package com.nuc.edu.shiro1;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;

public class TestA {
    public static void main(String[] args) {

        //1、解析shiro.ini文件
        Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro.ini");
        //2、通过SecurityManager工厂获得SecurityManager实例
        SecurityManager securityManager = factory.getInstance();
        //3、把SecurityManager对象设置到运行环境中
        SecurityUtils.setSecurityManager(securityManager);
        //4、通过SecurityUtils获得主体subject
        Subject subject=SecurityUtils.getSubject();
        //5、书写自己输入的账号和密码-----相当于用户自己输入的账号和密码
        //我们拿着自己输入账号和密码和shiro.ini文件中的账号和密码比较
        UsernamePasswordToken token=new UsernamePasswordToken("sxt","root");
        try {
            //6、用户身份验证
            subject.login(token);
            //7、通过方法判断是否登陆成功
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
