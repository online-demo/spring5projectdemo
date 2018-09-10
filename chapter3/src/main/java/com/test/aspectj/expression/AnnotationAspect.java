package com.test.aspectj.expression;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description 使用 @annotation() 来为所有加了 @Log 注解的方法织入增强
 */
@Component
@Aspect
public class AnnotationAspect {
    @AfterReturning("@annotation(com.test.aspectj.expression.Log)")
    public void log() {
        System.out.println("打印日志");
    }
}
