package com.test.aspectj.expression.args;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description args和@args切面逻辑
 */
@Aspect
public class ArgsAspect {

    @Before("args(java.lang.String)")
    public void before() {
        System.out.println("args匹配方法入参是String的方法");
    }

    @After("@args(com.test.aspectj.expression.args.Listen)")
    public void after() {
        System.out.println("@args匹配到方法执行了");
    }
}
