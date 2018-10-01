package com.test.aspectj.expression.within;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 测试within()和@ within()的切面
 */
@Aspect
public class WithinAspect {
    @Before("within(com.test.aspectj.expression.FoodFactory)")
    public void before() {
        System.out.println("方法执行前增强");
    }

    @After("@within(com.test.aspectj.expression.within.Monitor)")
    public void after() {
        System.out.println("@within匹配到，执行增强");
    }
}
