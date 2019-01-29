package com.test.sharding;

import com.alibaba.fastjson.JSON;
import com.test.sharding.entity.ShopInfo;
import com.test.sharding.service.ShopService;
import io.shardingjdbc.core.api.HintManager;
import io.shardingjdbc.core.hint.HintManagerHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/19
 * @Description: 单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-sharding.xml")
public class ShopInfoTest {
    @Resource
    ShopService shopService;

    public static Long shopId = 0L;

    /**
     * 模拟保存商户
     */
    @Test
    public void saveShop() {
        //保存10个商户
        for (int i = 0; i < 10; i++) {
            ShopInfo shopInfo = new ShopInfo();
            shopInfo.setShopId(shopId++);
            shopInfo.setAccount("Account" + i);
            shopInfo.setUserName("name" + i);
            shopService.saveShop(shopInfo);
        }
    }

    /**
     * 模拟查询商户
     */
    @Test
    public void queryShop() {
        ShopInfo shopInfo = shopService.queryShop(1L);
        System.out.printf("商户信息是=%s%n", JSON.toJSONString(shopInfo));
    }

    /**
     * 模拟保存商户
     */
    @Test
    public void saveShop2() {
        //保存10个商户
        for (int i = 10; i < 20; i++) {
            ShopInfo shopInfo = new ShopInfo();
            shopInfo.setShopId(Long.valueOf(i));
            shopInfo.setAccount("Account" + i);
            shopInfo.setUserName("name" + i);
            //强制修改路由规则
            if(i == 15) {
                HintManagerHolder.clear();
                HintManager hintManager = HintManager.getInstance();
                hintManager.addDatabaseShardingValue("shop_info", "shop_id", 2L);
                hintManager.addTableShardingValue("shop_info", "shop_id", 2L);
            }
            shopService.saveShop(shopInfo);
        }
    }

    /**
     * 测试主键自增
     */
    @Test
    public void saveShop3() throws InterruptedException {
        //保存10个商户
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ShopInfo shopInfo = new ShopInfo();
                    shopInfo.setAccount("Account" + finalI);
                    shopInfo.setUserName("name" + finalI);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    shopService.saveShopAutoIncrement(shopInfo);
                }
            }).start();
        }
        Thread.sleep(1000);
    }

}
