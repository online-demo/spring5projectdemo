package com.test.ioc.xml;

/**
 * 无参构造器实现IoC
 */
public class User implements Speakable {
    /**
     * 无参构造器
     */
    public User () {

    }

    /**
     * 说话的方法
     */
    @Override
    public void say() {
        System.out.println("大家好");
    }
}
