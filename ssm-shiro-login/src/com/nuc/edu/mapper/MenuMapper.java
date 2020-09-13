package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    public List<Menu> findMoreMenus(int rid,int pid);
}
