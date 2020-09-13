package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Admin;
import org.springframework.stereotype.Repository;


public interface AdminMapper {
    //查询单个用户操作
    public Admin selectOne(String uname, String pwd);
}
