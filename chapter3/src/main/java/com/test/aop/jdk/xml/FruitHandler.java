package com.test.aop.jdk.xml;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zhouguanya
 * @Date: 2018/8/250 19:100
 * @Description: 横切关注点,打印吃水果的时间
 */
public class FruitHandler {

    /**
     * 打印开始吃水果的时间
     */
    public void startEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String startEatDate = simpleDateFormat.format(new Date());
        System.out.println("开始吃水果的时间是：" + startEatDate);
    }

    /**
     * 打印吃完吃水果的时间
     */
    public void endEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String endEatDate = simpleDateFormat.format(new Date());
        System.out.println("结束吃水果的时间是：" + endEatDate);
    }
}
