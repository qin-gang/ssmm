package com.nuc.edu.service.impl;

import com.nuc.edu.mapper.MenuMapper;
import com.nuc.edu.pojo.Menu;
import com.nuc.edu.service.MenuService;
import com.nuc.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> findMoreMenus(int rid) {
        List<Menu> menuAll = menuMapper.findMoreMenus(rid, 0);
        for (Menu m:menuAll){
            int menuid = m.getMenuid();
            List<Menu> menus2 = menuMapper.findMoreMenus(rid, menuid);
            m.setMenu2(menus2);
        }
        return menuAll;
    }
}
