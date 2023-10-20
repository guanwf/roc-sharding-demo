
roc-sharding-demo
分库例子

分库串
 - 根据分库串读取不同的分库
 - shardingsphere-5.1.1
测试例子
- save
http://127.0.0.1:8088/goods/save
- select
  http://127.0.0.1:8088/goods/select



https://mp.weixin.qq.com/s/AUvcsschhqrhKopM5-XeMA

https://shardingsphere.apache.org/document/current/cn/dev-manual/mode/

https://zhuanlan.zhihu.com/p/383467428

分片算法
1） 精确分片算法 PreciseShardingAlgorithm
2） 范围分片算法 RangeShardingAlgorithm
3） 复合分片算法 ComplexKeysShardingAlgorithm
4） Hint分片算法 HintShardingAlgorithm
分片策略
1） 标准分片策略 StandardShardingStrateg
2） 复合分片策略 ComplexShardingStrategy
3） 行表达式分片策略 InlineShardingStrateg
4） Hint分片策略 HintShardingStrategy
5） 不分片策略 NoneShardingStrategy
分片策略配置
1） 数据源分片策略
2） 表分片策略
数据分片流程

https://gitee.com/huan1993/spring-cloud-parent/blob/master/sharding-jdbc/src/main/java/com/huan/study/sharding/algorithm/OrderComplexKeysShardingAlgorithm.java

https://blog.csdn.net/hyzsuccess/article/details/127644291

