package com.test.aspectj.aoptype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhouguanya
 * @Date: 2018/9/1 19:35
 * @Description: 测试各种类型的增强
 */
public class AllAspectDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aoptype.xml");
        Person person = (Person) context.getBean("person");
        person.say();
    }
}
