package com.test.sharding.config;


import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/19
 * @Description: 数据库分片的计算逻辑
 */
public class DemoDatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        for (String databaseName : collection) {
            //数据库后缀名
            String suffix = String.valueOf(preciseShardingValue.getValue() % 2);
            //如果数据库后缀 = suffix  则选择这个库
            if (databaseName.endsWith(suffix)) {
                return databaseName;
            }
        }
        throw new IllegalArgumentException("参数异常");
    }
}
