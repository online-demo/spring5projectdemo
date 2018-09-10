package com.test.springadvicetype.beforeadvice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author zhouguanya
 * @Date 2018/9/2
 * @Description 前置增强实现类
 */
@Component
public class SpringBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String methodName = method.getName();
        System.out.printf("MethodBeforeAdvice增强的方法是%s%n", methodName);
        System.out.printf("MethodBeforeAdvice增强的方法的参数是%s%n", args[0]);
        System.out.printf("MethodBeforeAdvice增强的对象是%s%n", target);
    }
}
