package com.nuc.edu.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menus implements Serializable {
     private int menuid;
     private String mname;
     private String url;
     private int pid;

     //保存二级菜单
    private List<Menus> menu2=new ArrayList<>();

    public List<Menus> getMenu2() {
        return menu2;
    }

    public void setMenu2(List<Menus> menu2) {
        this.menu2 = menu2;
    }

    private List<Menus> menus=new ArrayList<>();

    public List<Menus> getMenus() {
        return menus;
    }

    public void setMenus(List<Menus> menus) {
        this.menus = menus;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Menus() {
    }

    public Menus(int menuid, String mname, String url, int pid) {
        this.menuid = menuid;
        this.mname = mname;
        this.url = url;
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Menus{" +
                "menuid=" + menuid +
                ", mname='" + mname + '\'' +
                ", url='" + url + '\'' +
                ", pid=" + pid +
                '}';
    }
}
