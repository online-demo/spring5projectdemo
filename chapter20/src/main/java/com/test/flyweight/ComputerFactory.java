package com.test.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 电脑工厂
 */
public class ComputerFactory {
    private static final Map<String, Computer> computerMap = new HashMap<>();

    public static Computer getComputer(String brand) {
        Computer computer = computerMap.get(brand);
        if (computer == null) {
            computer = new ComputerProducer(brand);
            computerMap.put(brand, computer);

        }
        return computer;
    }
}
