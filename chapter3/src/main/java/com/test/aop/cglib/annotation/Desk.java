package com.test.aop.cglib.annotation;

import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/8/27
 * @Description 课桌
 */
@Component
public class Desk {
    /**
     * 打印位置信息
     */
    public void location () throws InterruptedException {
        //模拟耗时，方便观察输出结果
        Thread.sleep(1000);
        System.out.println("我是课桌，我被放在教室中");
    }
}
