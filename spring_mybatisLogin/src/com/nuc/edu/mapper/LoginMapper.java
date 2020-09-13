package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Admin;

public interface LoginMapper {
    public Admin selByUP(String uname,String pwd);

    public int insert(Admin admin);
}
