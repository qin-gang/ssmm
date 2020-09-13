package com.nuc.edu.service;

import com.nuc.edu.pojo.Admin;

public interface AdminService {

    //用户的登陆
    public Admin login(String uname, String pwd);

    //获得用户密码 和盐值操作
    public Admin findPwd(String uname);
}
