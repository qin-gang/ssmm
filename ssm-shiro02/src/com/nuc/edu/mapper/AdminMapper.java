package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {

    //查询单个操作
    public Admin selectOne(@Param("uname") String uname, @Param("pwd") String pwd);

    public Admin selectPwd(@Param("uname") String uname);

}
