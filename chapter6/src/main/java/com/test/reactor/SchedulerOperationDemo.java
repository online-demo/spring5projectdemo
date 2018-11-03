package com.test.reactor;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhouguanya
 * @Date 2018/11/2
 * @Description Schedulers demo
 */
public class SchedulerOperationDemo {

    public static void main(String[] args) throws InterruptedException {
        // 同步阻塞场景
        System.out.println(hello());
        System.out.println("--------同步阻塞场景执行结束--------");
        helloAsync();
        System.out.println("-------异步非阻塞场景执行结束-------");
        Thread.sleep(3000);
    }

    /**
     * 休眠2s后返回Hello, Reactor!
     */
    private static String hello() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, Reactor!";
    }

    /**
     * Schedulers异步非阻塞执行
     */
    private static void helloAsync() {
        // Callable调用同步hello方法
        Mono.fromCallable(() -> hello())
                // 弹性线程池执行
                .subscribeOn(Schedulers.elastic())
                // 打印结果
                .subscribe(System.out::println, System.err::println);
    }
}
