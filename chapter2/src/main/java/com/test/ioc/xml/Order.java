package com.test.ioc.xml;

/**
 * 有参构造器实现IoC
 */
public class Order implements Deliverable {
    /**
     * 订单号
     */
    private long orderId;
    /**
     * 订单金额
     */
    private double amount;

    /**
     * 有参构造器
     * @param orderId
     * @param amount
     */
    public Order (long orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    /**
     * 订单发货方法
     */
    @Override
    public void delivery() {
        System.out.printf("订单号%s，金额%s，已发货!", orderId, amount);
    }
}
