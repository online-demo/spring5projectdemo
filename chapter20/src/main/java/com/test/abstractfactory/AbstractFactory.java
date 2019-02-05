package com.test.abstractfactory;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 抽象工厂
 */
public abstract class AbstractFactory {
    /**
     * 创建电脑
     */
    abstract Computer createComputer(String type);
    /**
     * 制定电脑价格
     */
    abstract Price createPrice(String currency);
}
