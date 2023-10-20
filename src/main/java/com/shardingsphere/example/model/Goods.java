package com.shardingsphere.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
@author Guanwf
@create 2023/10/6 18:51
*/
@Data
@AllArgsConstructor
public class Goods {
    private Long id;
    private Integer splitCode;
    private String goodsId;
    private String goodsName;
}
