package com.test.cglibdynamicproxy;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author zhouguanya
 * @Date 2018/8/21
 * @Description 实现MethodInterceptor接口
 */
public class CatMethodInterceptor implements MethodInterceptor {

    /**
     * 生成方法拦截器
     * @param o 要进行增强的对象
     * @param method 拦截的方法
     * @param objects 参数列表
     * @param methodProxy 方法的代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("——————调用前处理——————");
        //对被代理对象方法的调用
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("——————调用后处理——————");
        return object;
    }
}
