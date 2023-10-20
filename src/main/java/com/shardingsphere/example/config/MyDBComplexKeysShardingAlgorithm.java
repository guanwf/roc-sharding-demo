package com.shardingsphere.example.config;

import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

/*
@author Guanwf
@create 2023/10/6 18:51
*/
public class MyDBComplexKeysShardingAlgorithm implements ComplexKeysShardingAlgorithm<Integer> {

    Properties properties;

    @Override
    public Collection<String> doSharding(Collection<String> databaseNames, ComplexKeysShardingValue<Integer> complexKeysShardingValue) {

        // 得到每个分片健对应的值
        Collection<Integer> splitCodeList = this.getShardingValue(complexKeysShardingValue, "split_code");

        List<String> shardingSuffix = new ArrayList<String>();
        /**
         * 通过分库串找到，对应的分库
         */
        for (Integer splitCode : splitCodeList) {
            for (String dbName : databaseNames) {
                if (dbName.endsWith(splitCode + ""))
                    shardingSuffix.add("ds" + splitCode);
            }
        }
        return shardingSuffix;
    }

    private Collection<Integer> getShardingValue(ComplexKeysShardingValue<Integer> shardingValues, final String key) {
        Collection<Integer> valueSet = new ArrayList<Integer>();
        Map<String, Collection<Integer>> columnNameAndShardingValuesMap = shardingValues.getColumnNameAndShardingValuesMap();
        if (columnNameAndShardingValuesMap.containsKey(key)) {
            valueSet.addAll(columnNameAndShardingValuesMap.get(key));
        }
        return valueSet;
    }

    @Override
    public void init() {

    }

    @Override
    public String getType() {
        return "COMPLEX_INLINE";
    }

    @Override
    public Properties getProps() {
        return this.properties;
    }

    @Override
    public void setProps(Properties properties) {
        this.properties = properties;
    }

}

