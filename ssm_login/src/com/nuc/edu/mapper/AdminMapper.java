package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    public Admin selectOne(@Param("uname") String uname,@Param("pwd") String pwd);
}
