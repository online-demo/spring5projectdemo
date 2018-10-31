package com.test.reactor;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.time.Duration;

/**
 * @Author zhouguanya
 * @Date 2018/10/31
 * @Description zip操作符测试
 */
public class ZipOperationDemo {
    public static void main(String[] args) {
        String desc = "I am Reactor";
        StepVerifier.create(
                // 将字符串拆分为一个一个的单词并以每500ms/个的速度发出
                Flux.zip(Flux.fromArray(desc.split("\\s+"))
                        , Flux.interval(Duration.ofMillis(500)))
                        // 打印
                        .doOnNext(System.out::print))
                        // 验证发出3个元素
                        .expectNextCount(3)
                        .verifyComplete();
    }
}
