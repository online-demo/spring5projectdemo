package com.test.reactor;

/**
 * @Author zhouguanya
 * @Date 2018/10/22
 * @Description 第一个Reactor程序
 */
public class FirstReactorDemo {
    public static void main(String[] args) {
        Flux.just(1, 2, 3, 4, 5, 6).subscribe(System.out::print);
        System.out.println();
        Mono.just(1).subscribe(System.out::println);
    }
}
