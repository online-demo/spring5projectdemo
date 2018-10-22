package com.test.aop.cglib.xml;

/**
 * @Author zhouguanya
 * @Date 2018/8/27
 * @Description 桌子
 */
public class Table {
    /**
     * 打印位置信息
     */
    public void location() throws InterruptedException {
        //模拟耗时，方便观察输出结果
        Thread.sleep(10000);
        System.out.println("我是餐桌，我被放在厨房中");
    }
}
