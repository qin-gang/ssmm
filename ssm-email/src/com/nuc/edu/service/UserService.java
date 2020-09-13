package com.nuc.edu.service;

import com.nuc.edu.pojo.Email;
import com.nuc.edu.pojo.User;

import java.util.List;

public interface UserService {
    //用户登陆实现
    public User login(String uname,String pwd);

    //查询当前用户的邮箱信息
    public List<Email> findMore(int recid);

    //发送邮件操作
    public int sendEmai(Email email);
}
