package com.test.mybatis.dao;

import com.test.mybatis.entity.Customer;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/24
 * @Description: 数据库访问层
 */
public interface CustomerDao {
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
    Customer query(int id);

    /**
     * 删除用户信息
     */
    int delete(int id);
}
