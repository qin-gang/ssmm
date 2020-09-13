package com.nuc.edu.mapper;

import com.nuc.edu.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //查询单个用户
    public User selectone(@Param("uname") String uname, @Param("pwd") String pwd);
}
