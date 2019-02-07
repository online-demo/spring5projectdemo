package com.test.proxy;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 代理模式测试类
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        CustomerProxy customerProxy = new CustomerProxy(new Customer());
        customerProxy.buy();
    }
}
