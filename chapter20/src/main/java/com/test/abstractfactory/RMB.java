package com.test.abstractfactory;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description:
 */
public class RMB implements Price {
    /**
     * 设置价格
     */
    @Override
    public void setPrice() {
        System.out.println("制定电脑的人民币售价");
    }
}
