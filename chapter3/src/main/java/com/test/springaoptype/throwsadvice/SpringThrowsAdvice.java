package com.test.springaoptype.throwsadvice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/2
 * @Description 异常抛出增强
 */
@Component
public class SpringThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e)  throws  Throwable{
        System.out.printf("异常抛出增强执行：%s%n", e);
    }
}
