package com.nuc.edu.service.impl;

import com.nuc.edu.mapper.AdminMapper;
import com.nuc.edu.mapper.RoleMapper;
import com.nuc.edu.pojo.Admin;
import com.nuc.edu.pojo.Menus;
import com.nuc.edu.pojo.Roles;
import com.nuc.edu.service.AdminService;
import com.nuc.edu.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("admins")
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Autowired
    MenusService menusService;
    @Autowired
    RoleMapper roleMapper;

    @Override
    public Admin login(String uname, String pwd) {

        return adminMapper.selectOne(uname, pwd);
    }

    @Override
    public Admin findPwd(String uname) {
        Admin admin = adminMapper.selectPwd(uname);
        List<Menus> adminList= menusService.findMoreMenus(admin.getRid());
        //将菜单保存到admin对象中
        admin.setMenusList(adminList);
        //把用户的身份保存到admin中
        Roles roles = roleMapper.selectOne(admin.getRid());
        admin.setRoles(roles);

        return admin;
    }
}
