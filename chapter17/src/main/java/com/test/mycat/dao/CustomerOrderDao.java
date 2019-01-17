package com.test.mycat.dao;

import com.test.mycat.model.CustomerOrder;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/04
 * @Description:
 */
public interface CustomerOrderDao {
    int save(CustomerOrder customer);
    CustomerOrder query(int id);
}
