package com.test.aop.jdk.xml;

/**
 * @Auther: zhouguanya
 * @Date: 2018/8/25 19:07
 * @Description: 苹果
 */
public class Apple implements Fruit {
    /**
     * 吃水果
     */
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
