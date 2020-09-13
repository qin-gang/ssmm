package com.nuc.edu.service;

import com.nuc.edu.pojo.User;

import java.util.List;

public interface UserService {
    public User findOne(String uname);

    public int addUser(User user);

    public List<User> findAll();
}
