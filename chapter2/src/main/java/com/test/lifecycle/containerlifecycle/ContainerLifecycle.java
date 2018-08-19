package com.test.lifecycle.containerlifecycle;

import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * @Author zhouguanya
 * @Date 2018/8/19
 * @Description 容器级生命周期
 */
public class ContainerLifecycle extends InstantiationAwareBeanPostProcessorAdapter {
    /**
     * 构造器
     */
    public ContainerLifecycle() {
        System.out.println("① 【容器级别】ContainerLifecycle构造器执行了");
    }

    /**
     * 接口方法和实例化Bean之前调用
     * @param beanClass
     * @param beanName
     * @return
     */
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName) {
        System.out.println("② 【容器级别】postProcessBeforeInstantiation方法执行了，class=" + beanClass);
        return null;
    }

    /**
     * 设置某个属性时调用
     * @param pvs
     * @param pds
     * @param bean
     * @param beanName
     * @return
     */
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) {
        System.out.println("③ 【容器级别】postProcessPropertyValues方法执行了，beanName=" + bean.getClass());
        return pvs;
    }

    /**
     * 接口方法和实例化Bean之后调用
     * @param bean
     * @param beanName
     * @return
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("④ 【容器级别】postProcessAfterInitialization方法执行了，beanName=" + bean.getClass());
        return null;
    }
}
