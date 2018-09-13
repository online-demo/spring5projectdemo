package com.test.aspectj.expression.execution;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 使用execution 来为所有Factory接口的实现类织入增强
 */
@Aspect
public class ExecutionAspect {
    @AfterReturning("execution(* com.test.aspectj.expression.Factory.*(..))")
    public void make() {
        System.out.println("make方法执行了");
    }
}
