package com.test.webclient;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author zhouguanya
 * @Date 2018/11/7
 * @Description DateService接口实现
 */
@Service
public class DateWebFluxServiceImpl implements DateWebFluxService {
    /**
     * 当前日期
     */
    @Override
    public Mono<String> queryCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return Mono.just("Today is " + format.format(new Date()));
    }
}
