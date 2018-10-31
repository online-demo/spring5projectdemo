package com.test.reactor;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.time.Duration;

/**
 * @Author zhouguanya
 * @Date 2018/10/31
 * @Description flatMap操作符测试
 */
public class FlatMapOperationDemo {
    public static void main(String[] args) {
        StepVerifier.create(
                Flux.just("flux", "mono")
                    // 将每个字符串拆分为包含一个字符串的字节流
                    .flatMap(s -> Flux.fromArray(s.split("\\s*"))
                    //对每个元素延迟100ms
                    .delayElements(Duration.ofMillis(1000)))
                    // 对每个元素进行打印 doOnNext不会消费数据流
                    .doOnNext(System.out::print))
                    //验证是否发出了8个元素
                    .expectNextCount(8)
                    .verifyComplete();
    }
}
