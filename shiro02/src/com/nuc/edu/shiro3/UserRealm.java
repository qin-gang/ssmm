package com.nuc.edu.shiro3;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.sql.*;

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
                SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(authenticationToken.getPrincipal(),rs.getString("pwd"), ByteSource.Util.bytes("秦刚"),"userRealm");
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
        return null;
    }


}
