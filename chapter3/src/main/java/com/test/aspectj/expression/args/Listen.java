package com.test.aspectj.expression.args;

import java.lang.annotation.*;

/**
 * @Author zhouguanya
 * @Date 2018/9/100
 * @Description 监听注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
public @interface Listen {
    String value() default "";
}
