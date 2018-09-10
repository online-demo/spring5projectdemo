package com.test.aspectj.expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 测试配置了 @Log 注解的方法织入了增强
 */
public class AspectJExpressionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aspectjexpression.xml");
        Factory foodFactory = (Factory) context.getBean("foodFactory");
        foodFactory.make();
        System.out.println("-----分割线-----");
        Factory phoneFactory = (Factory) context.getBean("phoneFactory");
        phoneFactory.make();
    }
}
