package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    //查询用户的指定信息
    public Account selectOne(@Param("cno") String cno,@Param("pwd") String pwd, @Param("money") String money);

    //执行汇款操作
    public int update1(@Param("Outcno") String Outcno,@Param("money") String money);

    //执行收款操作
    public int update2(@Param("Incno") String Incno,@Param("money") String money);
}
