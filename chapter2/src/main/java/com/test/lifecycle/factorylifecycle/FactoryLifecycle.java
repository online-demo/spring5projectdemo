package com.test.lifecycle.factorylifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author zhouguanya
 * @Date 2018/8/19
 * @Description 工厂级生命周期
 */
public class FactoryLifecycle implements BeanFactoryPostProcessor {

    /**
     * 构造器
     */
    public FactoryLifecycle () {
        System.out.println("一 【工厂级别】FactoryLifecycle构造器执行了");
    }

    /**
     * Bean实例化之前
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("二 【工厂级别】postProcessBeanFactory方法执行了");
    }
}
