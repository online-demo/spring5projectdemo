package com.test.mycat;

import com.alibaba.fastjson.JSON;
import com.test.mycat.dao.ItemDao;
import com.test.mycat.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/04
 * @Description: ItemDao分库测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mycat.xml")
public class ItemDaoTest {
    @Autowired
    private ItemDao itemDao;
    @Test
    public void testSave() {
        Item item_1 = new Item();
        item_1.setId(1);
        item_1.setValue(100);
        itemDao.save(item_1);
        Item item_2 = new Item();
        item_2.setId(2);
        item_2.setValue(200);
        itemDao.save(item_2);
        Item item_3 = new Item();
        item_3.setId(3);
        item_3.setValue(300);
        itemDao.save(item_3);
    }

    @Test
    public void testQuery() {
        System.out.println("商品1=" + JSON.toJSONString(itemDao.query(1)));
        System.out.println("商品2=" + JSON.toJSONString(itemDao.query(2)));
        System.out.println("商品3=" + JSON.toJSONString(itemDao.query(3)));
    }
}
