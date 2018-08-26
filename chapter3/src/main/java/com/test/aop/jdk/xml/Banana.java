package com.test.aop.jdk.xml;

/**
 * @Auther: 无双老师
 * @Date: 2018/8/25 19:08
 * @Description: 香蕉
 */
public class Banana implements Fruit {
    /**
     * 吃水果
     */
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}
