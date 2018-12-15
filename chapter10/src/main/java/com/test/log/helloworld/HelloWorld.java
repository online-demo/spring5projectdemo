package com.test.log.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhouguanya
 * @Date 2018/12/11
 * @Description 使用log4j2实现的第一个HelloWord程序
 */
public class HelloWorld {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        LOGGER.info("hello world");
        LOGGER.warn("hello world");
    }
}
