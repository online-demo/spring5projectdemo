package com.test.reactor;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @Author zhouguanya
 * @Date 2018/10/25
 * @Description StepVerifier测试案例
 */
public class StepVerifierDemo {
    public static void main(String[] args) {
        Flux flux = Flux.just(1, 2, 3, 4, 5, 6);
        // 使用StepVerifier测试Flux，应该正常
        StepVerifier.create(flux)
                //测试下一个期望的数据元素
                .expectNext(1, 2, 3, 4, 5, 6)
                //测试下一个元素是否为完成信号
                .expectComplete()
                .verify();

        Mono mono = Mono.error(new Exception("some error"));
        // 使用StepVerifier测试Mono，应该会出现异常
        StepVerifier.create(mono)
                //测试下一个元素是否为完成信号
                .expectComplete()
                .verify();
    }
}
