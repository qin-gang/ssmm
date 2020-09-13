package com.nuc.edu.shiro2;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm {

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shiro", "root", "root");
            PreparedStatement preparedStatement = conn.prepareStatement("select pwd from admin where uname=?");
            preparedStatement.setObject(1,  authenticationToken.getPrincipal());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(authenticationToken.getPrincipal(),rs.getString("pwd"),"userRealm");
                if (info!=null){
                    return info;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获得用户名  然后根据用户名查询这个用户对应的角色，在根据角色查询出指定角色下的所有菜单
        //返回指定角色下的所有菜单--List
        String username = principalCollection.getPrimaryPrincipal().toString();

        //模拟数据库中查的菜单
        List<String> list=new ArrayList<>();
        list.add("updateUser");
        list.add("addUser");
        list.add("deleteUser");
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        for (String l:list) {
            simpleAuthorizationInfo.addStringPermission(l);
        }
        return simpleAuthorizationInfo;
    }


}
