package com.test.builder;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/06
 * @Description: 电脑配件接口
 */
public interface Item {
    String name();
    Packing packing();
    int price();
}
