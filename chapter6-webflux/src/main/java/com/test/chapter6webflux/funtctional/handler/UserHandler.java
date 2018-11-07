package com.test.chapter6webflux.funtctional.handler;

import com.test.chapter6webflux.model.User;
import com.test.chapter6webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author zhouguanya
 * @Date 2018/11/07
 * @Description 辅助类
 */
@Component
public class UserHandler {

    private UserService userService;
    @Autowired
    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    public Mono<ServerResponse> queryAllUserList(ServerRequest serverRequest){
        Flux<User> allUser = userService.queryAllUserList();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(allUser,User.class);
    }

    public Mono<ServerResponse> queryUserById(ServerRequest serverRequest){
        //获取url上的id
        Long uid = Long.valueOf(serverRequest.pathVariable("id"));
        Mono<User> user = userService.queryUserById(uid);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(user,User.class);
    }

}
