package com.test.singleton;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 单例测试类
 */
public class SingletonObjectDemo {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }
}
