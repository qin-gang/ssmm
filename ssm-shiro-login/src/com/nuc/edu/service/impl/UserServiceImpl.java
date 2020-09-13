package com.nuc.edu.service.impl;

import com.nuc.edu.mapper.RoleMapper;
import com.nuc.edu.mapper.UserMapper;
import com.nuc.edu.pojo.Menu;
import com.nuc.edu.pojo.Role;
import com.nuc.edu.pojo.User;
import com.nuc.edu.service.MenuService;
import com.nuc.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    MenuService menuService;
    @Autowired
    RoleMapper roleMapper;

    @Override
    public User findOne(String uname) {
        User user = userMapper.findOne(uname);
        List<Menu> menus = menuService.findMoreMenus(user.getRid());
        user.setMenuList(menus);
        Role role = roleMapper.findRole(user.getRid());
        System.out.println();
        user.setRole(role);
        return user;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

}
