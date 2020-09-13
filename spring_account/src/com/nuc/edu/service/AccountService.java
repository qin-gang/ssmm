package com.nuc.edu.service;

import com.nuc.edu.pojo.Account;
import org.springframework.stereotype.Service;


public interface AccountService {
    //验证转账时的信息
    public Account findOne(String cno,String pwd,String money);

    //完成汇款操作
    public int inOutMoney(String inCno,String outCno,String money);
}
