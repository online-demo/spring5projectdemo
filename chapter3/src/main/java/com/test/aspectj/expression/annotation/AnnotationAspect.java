package com.test.aspectj.expression.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/100
 * @Description 使用 @annotation() 来为所有加了 @Log 注解的方法织入增强
 */
@Aspect
public class AnnotationAspect {
    @AfterReturning("@annotation(com.test.aspectj.expression.annotation.Log)")
    public void log() {
        System.out.println("打印日志");
    }
}
