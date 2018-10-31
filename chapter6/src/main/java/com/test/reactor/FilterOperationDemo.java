package com.test.reactor;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * @Author zhouguanya
 * @Date 2018/10/31
 * @Description filter操作符测试
 */
public class FilterOperationDemo {
    public static void main(String[] args) {
        StepVerifier.create(Flux.range(1, 6)
                // 过滤奇数
                .filter(i -> i % 2 == 1)
                // 过滤后的元素进行立方操作
                .map(i -> i * i * i))
                // 期望的结果
                .expectNext(1, 27, 125)
                // 异常情况模拟
                //.expectNext(1, 127, 125)
                .verifyComplete();
    }
}
