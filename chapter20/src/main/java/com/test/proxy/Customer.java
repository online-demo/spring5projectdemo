package com.test.proxy;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 客户
 */
public class Customer implements BuyHouse {
    @Override
    public void buy() {
        System.out.println("我是客户，我想买房");
    }
}
