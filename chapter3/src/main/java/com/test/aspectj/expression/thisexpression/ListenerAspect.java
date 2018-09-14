package com.test.aspectj.expression.thisexpression;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.Ordered;

/**
 * @Author zhouguanya
 * @Date 2018/9/13
 * @Description 为FoodFactory添加Listener接口的切面
 */
@Aspect
public class ListenerAspect implements Ordered {

    /**
     * 为FoodFactory添加接口实现，要实现的接口是Listener，接口的默认实现是DefaultListener
     */
    @DeclareParents(value = "com.test.aspectj.expression.FoodFactory", defaultImpl = DefaultListener.class)
    public static Listener listener;

    /**
     * 如果有多个切面，注意多切面织入的顺序
     */
    @Override
    public int getOrder() {
        return 2;
    }
}
