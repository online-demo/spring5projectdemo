package com.test.mycat.dao;

import com.test.mycat.model.Customer;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/04
 * @Description:
 */
public interface CustomerDao {
    int save(Customer customer);
    Customer query(int id);
}
