package com.test.abstractfactory;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 抽象工厂测试类
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // 电脑工厂
        AbstractFactory computerFactory = FactoryProducer.getFactory("Computer");
        Computer asus = computerFactory.createComputer("ASUS");
        asus.make();
        Computer lenovo = computerFactory.createComputer("Lenovo");
        lenovo.make();
        Computer macBook = computerFactory.createComputer("MacBook");
        macBook.make();
        // 价格工厂
        AbstractFactory priceFactory = FactoryProducer.getFactory("Price");
        Price rmb = priceFactory.createPrice("RMB");
        rmb.setPrice();
        Price dollar = priceFactory.createPrice("Dollar");
        dollar.setPrice();
        Price pound = priceFactory.createPrice("Pound");
        pound.setPrice();
    }
}
