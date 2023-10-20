package com.shardingsphere.example.mapper;


import com.shardingsphere.example.model.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsMapper {

    @Insert({"insert into goods_demo(id,split_code,goods_id,goods_name) values(#{id},#{splitCode},#{goodsId},#{goodsName})"})
    int insertGoods(Goods goods);

    @Select({"select * from goods_demo"})
    List<Goods> select();

}