package com.test.aop.jdk.xml;

/**
 * @Author: zhouguanya
 * @Date: 2018/8/250 19:07
 * @Description: 苹果
 */
public class Apple implements Fruit {
    /**
     * 吃水果
     */
    @Override
    public void eat() {
        try {
            //模拟吃苹果的过程
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃苹果");
    }
}
