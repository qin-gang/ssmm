package com.nuc.edu.service;

import com.nuc.edu.pojo.Flower;

import java.util.List;

public interface FlowerService {
    //查询所有花卉信息
    public List<Flower> findAll();

    public int save(Flower flower);
}
