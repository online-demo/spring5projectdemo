package com.test.webclient;

/**
 * @Author zhouguanya
 * @Date 2018/11/8
 * @Description 使用WebClient测试接口
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RunWith(SpringJUnit4ClassRunner.class)
//获取Spring上下文环境
@ContextConfiguration(locations = {
        "classpath*:chapter7.xml"})
public class WebClientTest {
    /**
     * 测试currentDate接口
     */
    @Test
    public void testCurrentDate() {
        WebClient webClient = WebClient.create("http://localhost:8080");
        Mono<String> resp = webClient
                .get().uri("/date/webflux/currentDate")
                .retrieve()
                .bodyToMono(String.class);
        System.out.println(resp.block());
    }

}
