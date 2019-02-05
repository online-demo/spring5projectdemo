package com.test.abstractfactory;

import com.test.common.ASUS;
import com.test.common.Computer;
import com.test.common.Lenovo;
import com.test.common.MacBook;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/05
 * @Description: 电脑工厂
 */
public class ComputerFactory  extends AbstractFactory{
    /**
     * createComputer方法返回不同品牌的电脑
     */
    public Computer createComputer(String type) {
        if (type == null || type.equals("")) {
            return null;
        }
        switch (type) {
            case "ASUS":
                return new ASUS();
            case "Lenovo":
                return new Lenovo();
            case "MacBook":
                return new MacBook();
            default:
                return null;
        }
    }

    /**
     * 制定电脑价格
     *
     * @param currency
     */
    @Override
    Price createPrice(String currency) {
        return null;
    }
}
