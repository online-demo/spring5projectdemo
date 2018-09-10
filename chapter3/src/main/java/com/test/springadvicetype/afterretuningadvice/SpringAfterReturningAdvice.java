package com.test.springadvicetype.afterretuningadvice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author zhouguanya
 * @Date 2018/9/2
 * @Description 后置增强
 */
@Component
public class SpringAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String methodName = method.getName();
        System.out.printf("AfterReturningAdvice增强的方法返回值是:%s%n", returnValue);
        System.out.printf("AfterReturningAdvice增强的方法是:%s%n", methodName);
        System.out.printf("AfterReturningAdvice增强的方法的参数是:%s%n", args[0]);
        System.out.printf("AfterReturningAdvice增强的对象是:%s%n", target);
    }
}
