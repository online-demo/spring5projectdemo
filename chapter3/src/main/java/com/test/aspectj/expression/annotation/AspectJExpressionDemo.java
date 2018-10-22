package com.test.aspectj.expression.annotation;

import com.test.aspectj.expression.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/9/100
 * @Description 测试ExecutionAspect切面
 */
public class AspectJExpressionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aspectjannotationexpression.xml");
        Factory foodFactory = (Factory) context.getBean("foodFactory");
        foodFactory.make();
        System.out.println("-----分割线-----");
        Factory phoneFactory = (Factory) context.getBean("phoneFactory");
        phoneFactory.make();
    }
}
