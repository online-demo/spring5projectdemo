package com.test.aop.jdk.xml;

/**
 * @Author: zhouguanya
 * @Date: 2018/8/25 19:07
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
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃苹果");
    }
}
