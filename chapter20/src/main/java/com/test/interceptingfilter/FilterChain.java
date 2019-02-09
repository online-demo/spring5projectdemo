package com.test.interceptingfilter;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 过滤器链
 */
public class FilterChain {
    //过滤器集合
    List<Filter> filterList = new ArrayList<>();
    private Target target;

    /**
     * 添加过滤器
     */
    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    /**
     * 执行过滤器
     */
    public void execute(){
        //前置拦截
        for (Filter filter : filterList) {
            filter.doFilter();
        }
        //执行目标对象
        target.execute();
    }

    /**
     * 设置目标对象
     */
    public void setTarget(Target target){
        this.target = target;
    }
}
