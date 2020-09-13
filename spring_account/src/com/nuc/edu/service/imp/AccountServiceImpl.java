package com.nuc.edu.service.imp;

import com.nuc.edu.mapper.AccountMapper;
import com.nuc.edu.pojo.Account;
import com.nuc.edu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accs")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account findOne(String cno, String pwd, String money) {
        return accountMapper.selectOne(cno, pwd, money);
    }

    @Override
    @Transactional
    public int inOutMoney(String inCno, String outCno, String money) {
        int i = accountMapper.update1(outCno, money);
        int i2 = accountMapper.update2(inCno, money);
        if (i>0&&i2>0){
            return 1;
        }else {
            return 0;
        }
    }


}
