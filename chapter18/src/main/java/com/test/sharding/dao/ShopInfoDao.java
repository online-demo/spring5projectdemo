package com.test.sharding.dao;

import com.test.sharding.entity.ShopInfo;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/19
 * @Description: ShopInfo DAO层
 */
public interface ShopInfoDao {
    /**
     * 保存商户
     */
    int insert(ShopInfo shopInfo);

    /**
     * 查询商户
     */
    ShopInfo selectByPrimaryKey(Long shopId);

    /**
     * 主键自增
     */
    int insertAutoIncrement(ShopInfo shopInfo);
}
