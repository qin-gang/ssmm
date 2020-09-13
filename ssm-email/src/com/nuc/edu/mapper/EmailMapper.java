package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Email;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmailMapper {
    //查询指定用户收件的信息
    public List<Email> selectMore(@Param("recid") int recid);

    //添加邮件
    public int insert(Email email);
}
