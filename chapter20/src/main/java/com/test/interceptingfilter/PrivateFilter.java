package com.test.interceptingfilter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 隐私过滤器
 */
public class PrivateFilter implements Filter {
    /**
     * 过滤方法
     */
    @Override
    public void doFilter() {
        System.out.println("Execute Private Words Filter");
    }
}
