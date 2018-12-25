package com.test.mybatis.controller;

import com.test.mybatis.entity.Customer;
import com.test.mybatis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/24
 * @Description: 控制层
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * 新增客户
     */
    @RequestMapping("/save")
    public int save(Customer customer) {
        return customerService.save(customer);
    }
    /**
     * 更新客户
     */
    @RequestMapping("/update")
    public int update(Customer customer) {
        return customerService.update(customer);
    }
    /**
     * 查询客户
     */
    @RequestMapping("/query")
    public Customer query(int customerId) {
        return customerService.query(customerId);
    }
    /**
     * 删除客户
     */
    @RequestMapping("/delete")
    public int delete(int customerId) {
        return customerService.delete(customerId);
    }
}
