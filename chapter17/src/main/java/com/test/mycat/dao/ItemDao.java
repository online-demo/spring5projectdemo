package com.test.mycat.dao;

import com.test.mycat.model.Item;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/04
 * @Description:
 */
public interface ItemDao {
    int save(Item customer);
    Item query(int id);
}
