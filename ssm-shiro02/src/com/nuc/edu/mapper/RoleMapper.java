package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Roles;

public interface RoleMapper {

    //查询所对应的Role
    public Roles selectOne(int rid);
}
