package com.nuc.edu.service.impl;

import com.nuc.edu.mapper.MenusMapper;
import com.nuc.edu.pojo.Menus;
import com.nuc.edu.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenusServiceImpl implements MenusService {
    @Autowired
    MenusMapper menusMapper;

    @Override
    public List<Menus> findMoreMenus(int rid) {
        //指定角色下的一级菜单
        List<Menus> menus = menusMapper.selectMore(rid, 0);

        for (Menus menu:menus){
            int menuid = menu.getMenuid();
            //指定一级菜单下对应的二级菜单
            List<Menus> menus1 = menusMapper.selectMore(rid, menuid);
            //把二级菜单保存到一级菜单对象中
            menu.setMenus(menus1);

        }
        return menus;
    }
}
