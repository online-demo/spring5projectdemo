package com.test.proxy;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 客户代理
 */
public class CustomerProxy implements BuyHouse {
    private Customer customer;

    public CustomerProxy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void buy() {
        customer.buy();
    }
}
