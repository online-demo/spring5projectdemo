package com.test.reactor;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * @Author zhouguanya
 * @Date 2018/10/30
 * @Description map操作符测试
 */
public class MapOperatorDemo {
    public static void main(String[] args) {
        // 生成从1开始的，步长为1的6个整型数据
        StepVerifier.create(Flux.range(1, 6)
                // 将元素进行立方操作
                .map(i -> i * i * i))
                // 期望值
                .expectNext(1, 8, 27, 64, 125, 216)
                // 异常情况模拟
                //.expectNext(10, 8, 27, 64, 125, 216)
                // 完成信号
                .expectComplete()
                .verify();
    }
}
