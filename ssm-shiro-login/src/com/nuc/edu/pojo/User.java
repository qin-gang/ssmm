package com.nuc.edu.pojo;

import org.apache.shiro.crypto.hash.Md5Hash;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int uid;
    private String uname;
    private String upwd;
    private String salt;
    private String realPwd;

    private int rid;
    private Role role;

    public String getRealPwd() {
        return realPwd;
    }

    public void setRealPwd(String realPwd) {
        this.realPwd = realPwd;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    private List<Menu> menuList=new ArrayList<>();

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd=" + upwd +
                ", salt='" + salt + '\'' +
                ", realPwd='" + realPwd + '\'' +
                ", rid=" + rid +
                ", role=" + role +
                ", menuList=" + menuList +
                '}';
    }
}
