package com.nuc.edu.service.impl;

import com.nuc.edu.mapper.EmailMapper;
import com.nuc.edu.mapper.UserMapper;
import com.nuc.edu.pojo.Email;
import com.nuc.edu.pojo.User;
import com.nuc.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    EmailMapper emailMapper;

    @Override
    public User login(String uname, String pwd) {
        return userMapper.selectone(uname,pwd);
    }

    @Override
    public List<Email> findMore(int recid) {
        return emailMapper.selectMore(recid);
    }

    @Override
    public int sendEmai(Email email) {
        return emailMapper.insert(email);
    }
}
