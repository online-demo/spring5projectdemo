package com.test.jdk8.defaultmethod;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/23
 * @Description:
 */
public interface Vehicle {
    /**
     * 默认方法
     */
    default void print() {
        System.out.println("我是一辆车");
    }

    /**
     * 抽象方法
     */
    void drive();
}
