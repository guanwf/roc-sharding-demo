package com.shardingsphere.example.service;

import com.shardingsphere.example.mapper.GoodsMapper;
import com.shardingsphere.example.model.Goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author Guanwf
@create 2023/10/6 19:09
*/
@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public int save(List<Goods> goodsList) {
        goodsList.stream().forEach(goodsMapper::insertGoods);
        return 1;
    }
    @Override
    public List<Goods> select() {
        return goodsMapper.select();
    }

}
