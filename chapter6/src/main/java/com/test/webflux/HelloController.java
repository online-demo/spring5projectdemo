package com.test.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author zhouguanya
 * @Date 2018/11/2
 * @Description webflux hello world
 */
@RestController
public class HelloController {

    @GetMapping("/helloflux")
    public Mono<String> helloFlux() {
        return Mono.just("welcome to webflux world ~");
    }

}