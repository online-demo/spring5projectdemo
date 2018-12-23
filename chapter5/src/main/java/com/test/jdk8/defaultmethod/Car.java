package com.test.jdk8.defaultmethod;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/23
 * @Description: Vehicle接口实现类Car
 */
public class Car implements Vehicle {
    /**
     * 抽象方法
     */
    @Override
    public void drive() {
        System.out.println("开一辆轿车");
    }
}
