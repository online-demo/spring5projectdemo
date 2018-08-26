package com.test.aop.jdk.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhouguanya
 * @Date: 2018/8/25 19:27
 * @Description:
 */
public class SpringAopXmlDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:spring-chapter3-xmlaop.xml");
        Fruit apple = (Fruit) applicationContext.getBean("apple");
        Fruit banana = (Fruit) applicationContext.getBean("banana");
        apple.eat();

    }
}
