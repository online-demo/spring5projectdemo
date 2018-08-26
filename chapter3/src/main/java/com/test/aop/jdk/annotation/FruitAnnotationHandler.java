package com.test.aop.jdk.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zhouguanya
 * @Date: 2018/8/25 19:10
 * @Description: 横切关注点,打印吃水果的时间
 */
@Component
@Aspect
public class FruitAnnotationHandler {
    /**
     * 定义切点
     */
    @Pointcut("execution(* com.test.aop.jdk.xml.Fruit.*(..))")
    public void eatFruit() {

    }

    /**
     * 前置通知
     * 打印开始吃水果的时间
     */
    @Before("eatFruit()")
    public void startEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String startEatDate = simpleDateFormat.format(new Date());
        System.out.println("开始吃水果的时间是：" + startEatDate);
    }

    /**
     * 后置通知
     * 打印吃完吃水果的时间
     */
    @After("eatFruit()")
    public void endEatFruitDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String endEatDate = simpleDateFormat.format(new Date());
        System.out.println("结束吃水果的时间是：" + endEatDate);
    }
}
