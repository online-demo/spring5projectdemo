package com.test.interceptingfilter;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/08
 * @Description: 客户端
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(){
        filterManager.filterRequest();
    }
}
