package com.test.springaoptype.methodinterceptor;

import com.test.springaoptype.Waiter;
import com.test.springaoptype.afterretuningadvice.SpringAfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/9/2
 * @Description Spring环绕增强测试
 */
public class SpringBeforeAdviceDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-springaoptype.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        SpringMethodInterceptor advice = (SpringMethodInterceptor) context.getBean("springMethodInterceptor");
        //Spring提供的代理工厂
        ProxyFactory pf = new ProxyFactory();
        //设置代理目标
        pf.setTarget(waiter);
        pf.addAdvice(advice);
        //生成代理实例
        Waiter proxy = (Waiter)pf.getProxy();
        proxy.serve("Michael");
        proxy.serve("Tommy");
    }
}
