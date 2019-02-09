package com.test.interceptingfilter;


/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 敏感词过滤器
 */
public class SensitiveFilter implements Filter {
    /**
     * 过滤方法
     */
    @Override
    public void doFilter() {
        System.out.println("Execute Sensitive Words Filter");
    }
}
