package com.nuc.edu.service.imp;

import com.nuc.edu.mapper.FlowerMapper;
import com.nuc.edu.pojo.Flower;
import com.nuc.edu.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    FlowerMapper flowerMapper;

    public void setFlowerMapper(FlowerMapper flowerMapper) {
        this.flowerMapper = flowerMapper;
    }

    @Override

    public List<Flower> findAll() {
        return flowerMapper.selAll();
    }

    @Override
    public int save(Flower flower) {
        return flowerMapper.save(flower);
    }
}
