package com.test.mybatis.service;

import com.test.mybatis.dao.CustomerDao;
import com.test.mybatis.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/24
 * @Description:
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    /**
     * 保存客户信息
     */
    @Override
    public int save(Customer customer) {
        return customerDao.save(customer);
    }

    /**
     * 更新用户信息
     */
    @Override
    public int update(Customer customer) {
        return customerDao.update(customer);
    }

    /**
     * 查询用户信息
     */
    @Override
    public Customer query(int customerId) {
        return customerDao.query(customerId);
    }

    /**
     * 删除用户信息
     */
    @Override
    public int delete(int customerId) {
        return customerDao.delete(customerId);
    }
}
