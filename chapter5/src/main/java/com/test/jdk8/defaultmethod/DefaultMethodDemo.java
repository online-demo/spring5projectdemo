package com.test.jdk8.defaultmethod;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/23
 * @Description:
 */
public class DefaultMethodDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        // 调用Vehicle接口默认方法
        car.print();
        // 调用Car中重写的drive方法
        car.drive();
        Bus bus = new Bus();
        bus.print();
        bus.drive();
        Whistle.horn();
    }
}
