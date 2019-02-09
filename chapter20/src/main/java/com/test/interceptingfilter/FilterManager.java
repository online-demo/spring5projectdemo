package com.test.interceptingfilter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 过滤器管理员
 */
public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(){
        filterChain.execute();
    }
}
