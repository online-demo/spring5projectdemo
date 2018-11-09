package com.test.webclient;

import reactor.core.publisher.Mono;

/**
 * @Author zhouguanya
 * @Date 2018/11/7
 * @Description 时间接口
 */
public interface DateWebFluxService {
    /**
     * 当前日期
     */
    Mono<String> queryCurrentDate();
}
