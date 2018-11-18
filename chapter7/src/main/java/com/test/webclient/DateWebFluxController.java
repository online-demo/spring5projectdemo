package com.test.webclient;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
/**
 * @Author zhouguanya
 * @Date 2018/11/7
 * @Description 控制器
 */
@RestController("dateWebFluxController")
public class DateWebFluxController {
    @Resource
    private DateWebFluxService dateWebFluxService;

    @RequestMapping("/date/webflux/currentDate")
    public Mono<String> getCurrentDate() {
        return dateWebFluxService.queryCurrentDate();
    }

}
