package com.test.interceptingfilter;


/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 脏话过滤器
 */
public class DirtyFilter implements Filter {
    /**
     * 过滤方法
     */
    @Override
    public void doFilter() {
        System.out.println("Execute Dirty Words Filter");
    }
}
