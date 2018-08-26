package com.test.aop.jdk.xml;

/**
 * @Author: zhouguanya
 * @Date: 2018/8/25 19:08
 * @Description: 香蕉
 */
public class Banana implements Fruit {
    /**
     * 吃水果
     */
    @Override
    public void eat() {
        try {
            //模拟吃香蕉的过程
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃香蕉");
    }
}
