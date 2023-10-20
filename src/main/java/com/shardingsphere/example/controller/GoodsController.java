package com.shardingsphere.example.controller;

import com.google.common.collect.Lists;
import com.shardingsphere.example.model.Goods;
import com.shardingsphere.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/*
@author Guanwf
@create 2023/10/6 19:08
*/
@RestController()
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    List<Goods> goodsList = Lists.newLinkedList();

    @PostConstruct
    public void getData() {
        goodsList.add(new Goods(1L, 1, "A001", "A001商品"));
        goodsList.add(new Goods(2L, 2, "A002", "A002商品"));
    }

    /**
     * http://127.0.0.1:8088/goods/save
     *
     * @return
     */
    @GetMapping("save")
    public int save() {
        return goodsService.save(goodsList);
    }

    @GetMapping("select")
    public Object select() {
        return goodsService.select();
    }
}
