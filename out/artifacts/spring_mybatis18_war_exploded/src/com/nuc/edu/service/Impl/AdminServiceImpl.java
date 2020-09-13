package com.nuc.edu.service.Impl;

import com.nuc.edu.mapper.AdminMapper;
import com.nuc.edu.pojo.Admin;
import com.nuc.edu.service.AdminService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminServiceImpl implements AdminService{
    AdminMapper adminMapper=null;
    @Override
    public Admin login(String uname, String pwd) {
        Admin admin = adminMapper.selectOne(uname, pwd);
        return admin;
    }

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }
}
