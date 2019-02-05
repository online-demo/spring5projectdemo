package com.test.abstractfactory;

import com.test.common.Computer;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 价格工厂
 */
public class PriceFactory extends AbstractFactory{
    /**
     * 创建电脑
     */
    @Override
    Computer createComputer(String type) {
        return null;
    }

    /**
     * 制定电脑价格
     */
    @Override
    Price createPrice(String currency) {
        if (currency == null || currency.equals("")) {
            return null;
        }
        switch (currency) {
            case "RMB":
                return new RMB();
            case "Dollar":
                return new Dollar();
            case "Pound":
                return new Pound();
            default:
                return null;
        }
    }
}
