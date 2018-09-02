package com.test.aoptype;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouguanya
 * @Date: 2018/9/1 19:08
 * @Description: 包含各种增强类型的切面
 */
@Component
@Aspect
public class AllAspect {

    @Pointcut("execution(* com.test.aoptype.*.*(..))")
    public void pointCut() {

    }

    /**
     * 前置增强
     */
    @Before("pointCut() ")
    public void before() {
        System.out.println("before advice");
    }

    /**
     * 环绕增强
     * @param proceedingJoinPoint
     */
    @Around("pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around advice 1");
        proceedingJoinPoint.proceed();
        System.out.println("around advice 2");
    }


    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning advise");
    }

    /**
     * 异常抛出增强
     */
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice");
    }

    /**
     * 后置增强
     */
    @After("pointCut()")
    public void after() {
        System.out.println("after advise");
    }
}
