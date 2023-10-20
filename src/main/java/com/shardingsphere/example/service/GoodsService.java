package com.shardingsphere.example.service;

import com.shardingsphere.example.model.Goods;

import java.util.List;

/*
@author Guanwf
@create 2023/10/6 19:08
*/
public interface GoodsService {
    int save(List<Goods> goodsList);
    List<Goods> select();
}
