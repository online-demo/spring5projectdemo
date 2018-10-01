package com.test.aspectj.expression.within;

import com.test.aspectj.expression.Factory;
import com.test.aspectj.expression.PhoneFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 测试
 */
public class WithinExpressionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aspectjwithinexpression.xml");
        Factory foodFactory = (Factory) context.getBean("foodFactory");
        foodFactory.make();
        System.out.println("-----分割线-----");
        IPhoneFactory iPhoneFactory = (IPhoneFactory) context.getBean("iPhoneFactory");
        iPhoneFactory.testWithin();
        System.out.println("-----分割线-----");
        MobilePhoneFactory mobilePhoneFactory = (MobilePhoneFactory) context.getBean("mobilePhoneFactory");
        mobilePhoneFactory.testWithin();
    }
}
