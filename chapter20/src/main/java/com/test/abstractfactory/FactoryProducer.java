package com.test.abstractfactory;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 工厂生成器
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if ("Computer".equals(factoryType)) {
            return new ComputerFactory();
        } else if ("Price".equals(factoryType)) {
            return new PriceFactory();
        }
        return null;
    }
}
