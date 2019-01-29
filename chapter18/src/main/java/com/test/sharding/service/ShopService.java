package com.test.sharding.service;


import com.test.sharding.entity.ShopInfo;
import com.test.sharding.dao.ShopInfoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/19
 * @Description: Service层
 */
@Service
public class ShopService {

    @Resource
    ShopInfoDao shopInfoDao;

    /**
     * 保存商户
     */
    public void saveShop(ShopInfo userInfo) {
        shopInfoDao.insert(userInfo);
    }

    /**
     * 查询商户
     */
    public ShopInfo queryShop(Long userId) {
        return shopInfoDao.selectByPrimaryKey(userId);
    }

    /**
     * 保存商户，主键自增
     */
    public void saveShopAutoIncrement(ShopInfo userInfo) {
        shopInfoDao.insertAutoIncrement(userInfo);
    }
}
