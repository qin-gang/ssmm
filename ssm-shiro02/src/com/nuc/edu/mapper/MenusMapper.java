package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Menus;

import java.util.List;

public interface MenusMapper {
    //菜单的查询
    public List<Menus> selectMore(int rid,int pid);
}
