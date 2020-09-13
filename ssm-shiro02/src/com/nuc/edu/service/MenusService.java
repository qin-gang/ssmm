package com.nuc.edu.service;

import com.nuc.edu.pojo.Menus;

import java.util.List;

public interface MenusService {
    //查询指定角色的菜单
    public List<Menus> findMoreMenus(int rid);
}
