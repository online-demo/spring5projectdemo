package com.test.aspectj.expression.thisexpression;


/**
 * @Author zhouguanya
 * @Date 2018/9/13
 * @Description Listener接口实现类
 */
public class DefaultListener implements Listener {
    /**
     * 监听
     */
    @Override
    public void listen() {
        System.out.println("开始监听");
    }
}
