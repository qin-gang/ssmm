package com.nuc.edu.service;

import com.nuc.edu.pojo.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> findMoreMenus(int rid);
}
