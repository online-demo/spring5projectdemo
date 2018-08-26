package com.test.aop.jdk.annotation;

import com.test.aop.jdk.xml.Fruit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhouguanya
 * @Date: 2018/8/25 19:27
 * @Description: xml aop测试
 */
public class SpringAopAnnotationDemo {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:spring-chapter3-annotationaop.xml");
        Fruit apple = (Fruit) applicationContext.getBean("apple");
        Fruit banana = (Fruit) applicationContext.getBean("banana");
        apple.eat();
        System.out.println("-----休息一会儿-----");
        Thread.sleep(1000);
        banana.eat();
    }
}
