package com.test.chapter6webflux.funtctional.router;

import com.test.chapter6webflux.funtctional.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @Author zhouguanya
 * @Date 2018/11/07
 * @Description 配置类
 */
@Configuration
public class RoutingConfiguration {

    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction(UserHandler userHandler){
        return route(GET("/user/all")
                        .and(accept(MediaType.APPLICATION_JSON)),userHandler::queryAllUserList)
                .andRoute(GET("/user/{id}")
                        .and(accept(MediaType.APPLICATION_JSON)),userHandler::queryUserById);
    }

}
