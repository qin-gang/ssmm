package com.nuc.edu.service;

import com.nuc.edu.pojo.Admin;

public interface LoginService {
    public Admin findAdmin(String uname,String pwd);
}
