package com.nuc.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int menuid;
    private String menuname;
    private String url;
    private int pid;

    private List<Menu> menu2=new ArrayList<>();

    public List<Menu> getMenu2() {
        return menu2;
    }

    public void setMenu2(List<Menu> menu2) {
        this.menu2 = menu2;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
