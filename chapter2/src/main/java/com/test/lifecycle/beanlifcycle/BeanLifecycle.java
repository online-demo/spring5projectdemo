package com.test.lifecycle.beanlifcycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author zhouguanya
 * @Date 2018/8/18
 * @Description Bean生命周期
 */
public class BeanLifecycle implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    /**
     * 1. 构造器
     */
    public BeanLifecycle() {
        System.out.println("1. 【Bean级别】构造器执行了");
    }

    /**
     * 2. BeanNameAware接口方法实现
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("2. 【Bean级别】setBeanName方法执行了");
    }

    /**
     * 3. ApplicationContextAware接口方法实现
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("3. 【Bean级别】setApplicationContext方法执行了");
    }

    /**
     * 4. InitializingBean接口方法实现
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4. 【Bean级别】afterPropertiesSet方法执行了");
    }

    /**
     * 5. init-method属性指定的方法
     */
    public void lifecycleInit() {
        System.out.println("5. 【Bean级别】init-method指定的方法执行了");
    }

    /**
     * 6. Bean中的业务方法
     */
    public void sayHello() {
        System.out.println("6. 【Bean级别】sayHello方法执行了");
    }

    /**
     * 7. DisposableBean接口方法实现
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("7. 【Bean级别】destroy方法执行了");
    }

    /**
     * 8. destroy-method属性指定的方法
     */
    public void lifecycleInitDestroy() {
        System.out.println("8. 【Bean级别】destroy-method属性指定的方法执行了");
    }
}
