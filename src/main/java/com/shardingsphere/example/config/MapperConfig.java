package com.shardingsphere.example.config;

import org.apache.shardingsphere.infra.config.algorithm.ShardingSphereAlgorithmConfiguration;
import org.apache.shardingsphere.sharding.api.config.ShardingRuleConfiguration;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@MapperScan(basePackages = "com.shardingsphere.example.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
public class MapperConfig {

    @Bean("MyDBComplexKeysShardingAlgorithm")
    public ComplexKeysShardingAlgorithm myDBComplexKeysShardingAlgorithm(){
        return new MyDBComplexKeysShardingAlgorithm();
    }
/*
    @Bean
    public ShardingRuleConfiguration shardingRuleConfiguration(){
        ShardingRuleConfiguration ruleConfiguration = new ShardingRuleConfiguration();
        ruleConfiguration.getShardingAlgorithms().put("MyDBComplexKeysShardingAlgorithm",new ShardingSphereAlgorithmConfiguration("COMPLEX_INLINE",null));
        return ruleConfiguration;
    }*/

}