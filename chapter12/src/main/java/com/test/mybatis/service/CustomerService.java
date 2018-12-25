package com.test.mybatis.service;

import com.test.mybatis.entity.Customer;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/24
 * @Description: service接口
 */
public interface CustomerService {
    /**
     * 保存客户信息
     */
    int save(Customer customer);

    /**
     * 更新用户信息
     */
    int update(Customer customer);

    /**
     * 查询用户信息
     */
    Customer query(int customerId);

    /**
     * 删除用户信息
     */
    int delete(int customerId);
}
