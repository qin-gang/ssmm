package com.nuc.edu.realm;

import com.nuc.edu.pojo.Admin;
import com.nuc.edu.service.AdminService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    AdminService adminService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println(authenticationToken.getPrincipal().toString()+"---");
        Admin admin = adminService.findPwd(authenticationToken.getPrincipal().toString());
        if (admin!=null){
            SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(admin,admin.getPwd(), ByteSource.Util.bytes(admin.getSalt()),"userRealm");
            return info;
        }
        return null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Admin admin = (Admin) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //将角色名称保存到SimpleAuthorizationInfo
        info.addRole(admin.getRoles().getRolename());
        return info;
    }


}
