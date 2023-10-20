
drop table goods_demo;

CREATE TABLE `goods_demo` (
 `id` bigint(32) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
 `split_code` int(4) DEFAULT 0 COMMENT '分库串',
 `goods_id` varchar(32) not NULL COMMENT 'goodsId',
 `goods_name` varchar(32) not NULL COMMENT 'goodsName',
 `create_time` datetime DEFAULT now() COMMENT '创建时间',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


