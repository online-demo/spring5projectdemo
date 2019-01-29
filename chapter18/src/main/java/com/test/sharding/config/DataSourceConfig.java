package com.test.sharding.config;


import io.shardingjdbc.core.api.config.ShardingRuleConfiguration;
import io.shardingjdbc.core.api.config.TableRuleConfiguration;
import io.shardingjdbc.core.api.config.strategy.StandardShardingStrategyConfiguration;
import io.shardingjdbc.core.jdbc.core.datasource.ShardingDataSource;
import io.shardingjdbc.core.keygen.DefaultKeyGenerator;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/19
 * @Description: sharding-jdbc数据源配置
 */
@Configuration
public class DataSourceConfig {

    /**
     * sharding-jdbc数据源
     */
    @Bean(name = "shardingDataSource")
    DataSource getShardingDataSource() throws SQLException {
        ShardingRuleConfiguration shardingRuleConfiguration;
        shardingRuleConfiguration = new ShardingRuleConfiguration();
        //表规则配置
        shardingRuleConfiguration.getTableRuleConfigs().add(getShopTableRuleConfiguration());
        //表的组 shop_info
        shardingRuleConfiguration.getBindingTableGroups().add("shop_info");
        //DataBase的分片策略  配合DemoDatabaseShardingAlgorithm数据库分片逻辑
        shardingRuleConfiguration.setDefaultDatabaseShardingStrategyConfig(new StandardShardingStrategyConfiguration("shop_id", DemoDatabaseShardingAlgorithm.class.getName()));
        //Table的分片策略
        shardingRuleConfiguration.setDefaultTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("shop_id", DemoTableShardingAlgorithm.class.getName()));
        //根据配置实例化一个ShardingDataSource  bean
        return new ShardingDataSource(shardingRuleConfiguration.build(createDataSourceMap()));
    }

    /**
     * 商户表规则配置
     * @return
     */
    @Bean
    TableRuleConfiguration getShopTableRuleConfiguration() {
        TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
        //逻辑表是shop_info
        orderTableRuleConfig.setLogicTable("shop_info");
        //实际的物理节点是shop_${0..1}.shop_info_${0..1} 即database.table
        orderTableRuleConfig.setActualDataNodes("shop_${0..1}.shop_info_${0..1}");
        orderTableRuleConfig.setKeyGeneratorColumnName("shop_id");
        // 主键生成类
        orderTableRuleConfig.setKeyGeneratorClass(DefaultKeyGenerator.class.getName());
        return orderTableRuleConfig;
    }

    /**
     * 封装多个MySQL数据源
     */
    private Map<String, DataSource> createDataSourceMap() {
        Map<String, DataSource> result = new HashMap<>(2);
        result.put("shop_0", createDataSource("shop_0"));
        result.put("shop_1", createDataSource("shop_1"));
        return result;
    }

    /**
     * MySQL数据源
     */
    private DataSource createDataSource(final String dataSourceName) {
        BasicDataSource result = new BasicDataSource();
        result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
        result.setUrl(String.format("jdbc:mysql://localhost:3306/%s?characterEncoding=utf-8&useSSL=false", dataSourceName));
        result.setUsername("root");
        result.setPassword("123456");
        return result;
    }
}
