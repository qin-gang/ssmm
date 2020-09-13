package com.nuc.edu.service.imp;

import com.nuc.edu.mapper.AdminMapper;
import com.nuc.edu.pojo.Admin;
import com.nuc.edu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin login(String uname, String pwd) {
        return adminMapper.selectOne(uname, pwd);
    }
}
