package com.test;

import java.util.ServiceLoader;

/**
 * @Author: zhouguanya
 * @Date: 2019-02-04
 * @Description:
 */
public class SpiDemo {
    public static void main(String[] args) {
        ServiceLoader<SpiHelloService> services = ServiceLoader.load(SpiHelloService.class);
        for (SpiHelloService service : services) {
            service.say();
        }
    }
}
