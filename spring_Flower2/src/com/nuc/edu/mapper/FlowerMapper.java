package com.nuc.edu.mapper;

import com.nuc.edu.pojo.Flower;

import java.util.List;

public interface FlowerMapper {

    public List<Flower> selAll();

    public int save(Flower flower);
}
