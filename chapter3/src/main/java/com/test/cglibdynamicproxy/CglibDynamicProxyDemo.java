package com.test.cglibdynamicproxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Author zhouguanya
 * @Date 2018/8/21
 * @Description 测试Cglib
 */
public class CglibDynamicProxyDemo {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //被代理类：Cat
        enhancer.setSuperclass(Cat.class);
        //设置回调
        enhancer.setCallback(new CatMethodInterceptor());
        //生成代理对象
        Cat cat = (Cat) enhancer.create();
        //调用代理类的方法
        cat.cry();
    }
}
