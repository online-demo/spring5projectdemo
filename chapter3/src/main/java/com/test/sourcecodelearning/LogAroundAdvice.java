package com.test.sourcecodelearning;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author zhouguanya
 * @Date 2018/100/3
 * @Description 通知
 */
public class LogAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        System.out.println("方法执行开始时间：" + dateFormat.format(new Date()));
        invocation.proceed();
        System.out.println("方法执行结束时间：" + dateFormat.format(new Date()));
        return null;
    }
}
