package com.test.springadvicetype.methodinterceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Service;

/**
 * @Author zhouguanya
 * @Date 2018/9/2
 * @Description 环绕增强
 */
@Service
public class SpringMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // 前置增强
        System.out.println("前置增强执行了");
        // 通过反射机制调用目标方法
        Object obj = invocation.proceed();
        // 后置增强
        System.out.println("后置增强执行了");
        return obj;
    }
}
