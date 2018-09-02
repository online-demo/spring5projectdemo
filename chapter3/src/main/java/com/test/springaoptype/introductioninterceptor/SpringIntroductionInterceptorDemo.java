package com.test.springaoptype.introductioninterceptor;

import com.test.springaoptype.Waiter;
import com.test.springaoptype.methodinterceptor.SpringMethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/9/2
 * @Description Spring引介增强测试
 */
public class SpringIntroductionInterceptorDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-springintroductioninterceptor.xml");
        Waiter waiterProxy = (Waiter) context.getBean("waiterProxy");
        waiterProxy.serve("Michael");
        Management manager = (Management)waiterProxy;
        manager.manage("Michael");
    }
}
