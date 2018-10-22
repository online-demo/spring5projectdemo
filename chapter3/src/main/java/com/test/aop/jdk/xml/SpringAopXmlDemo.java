package com.test.aop.jdk.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhouguanya
 * @Date: 2018/8/250 19:27
 * @Description: xml aop测试
 */
public class SpringAopXmlDemo {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:spring-chapter3-xmlaop.xml");
        Fruit apple = (Fruit) applicationContext.getBean("apple");
        Fruit banana = (Fruit) applicationContext.getBean("banana");
        apple.eat();
        System.out.println("-----休息一会儿-----");
        Thread.sleep(10000);
        banana.eat();
    }
}
