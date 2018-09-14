package com.test.aspectj.expression.thisexpression;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

/**
 * @Author zhouguanya
 * @Date 2018/9/13
 * @Description
 */
@Aspect
public class ThisAspect implements Ordered {
    /**
     * 织入运行期对象为Listener类型的Bean中
     */
    @AfterReturning("this(com.test.aspectj.expression.thisexpression.Listener)")
    public void after() {
        System.out.println("ThisAspect执行了");
    }

    /**
     * 如果有多个切面，注意多切面织入的顺序
     */
    @Override
    public int getOrder() {
        return 1;
    }
}
