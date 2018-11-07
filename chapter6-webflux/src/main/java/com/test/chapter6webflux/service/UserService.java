package com.test.chapter6webflux.service;

import com.test.chapter6webflux.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author zhouguanya
 * @Date 2018/11/07
 * @Description user接口
 */
public interface UserService {
    /**
     * 查询所有用户
     */
    Flux<User> queryAllUserList();
    /**
     * 根据id查询用户
     */
    Mono<User> queryUserById(Long id);

}
