package com.test.aop.cglib.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/8/27
 * @Description cglib aop测试
 */
public class CgLibAnnotationDemo {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("classpath:spring-chapter3-annotationcglibaop.xml");
        Desk desk = (Desk) applicationContext.getBean("desk");
        Table table = (Table) applicationContext.getBean("table");
        desk.location();
        System.out.println("-----分割线-----");
        Thread.sleep(10000);
        table.location();
    }
}
