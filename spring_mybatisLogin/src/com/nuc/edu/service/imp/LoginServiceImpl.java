package com.nuc.edu.service.imp;

import com.nuc.edu.mapper.LoginMapper;
import com.nuc.edu.pojo.Admin;
import com.nuc.edu.service.LoginService;

public class LoginServiceImpl implements LoginService {

    LoginMapper loginMapper;

    public void setLoginMapper(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    @Override
    public Admin findAdmin(String uname, String pwd) {

        Admin admin=new Admin();
        admin.setUname("zl");
        admin.setPwd("123");
        int i = loginMapper.insert(admin);

        Admin admin2=new Admin();
        admin2.setUname("wb");
        admin2.setPwd("123");
        int i2 = loginMapper.insert(admin2);

        return loginMapper.selByUP(uname, pwd);
    }
}
