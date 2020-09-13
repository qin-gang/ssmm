package com.nuc.edu.mapper;

import com.nuc.edu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public User findOne(@Param("uname") String uname);

    public int addUser(User user);

    public List<User> findAll();
}
