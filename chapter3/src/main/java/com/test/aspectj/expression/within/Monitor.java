package com.test.aspectj.expression.within;

import java.lang.annotation.*;

/**
 * @Author zhouguanya
 * @Date 2018/9/12
 * @Description 监控
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
public @interface Monitor {
    String value() default "";
}
