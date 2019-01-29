package com.test.sharding.config;


import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/19
 * @Description: 数据表的分片规则
 */
public class DemoTableShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        for (String tableName : collection) {
            //表的后缀名
            String suffix = String.valueOf(preciseShardingValue.getValue() % 2);
            //如果表的后缀 = suffix  则选择这个表
            if (tableName.endsWith(suffix)) {
                return tableName;
            }
        }
        throw new IllegalArgumentException("参数异常");
    }
}