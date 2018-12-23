package com.test.jdk8.defaultmethod;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/23
 * @Description:
 */
public class Bus implements Vehicle, Whistle {
    /**
     * 同时实现Vehicle，Whistle接口，需要重写默认方法
     */
    public void print() {
        System.out.println("我是一辆巴士");
    }

    /**
     * 实现抽象方法
     */
    @Override
    public void drive() {
        System.out.println("开一辆巴士");
    }
}
