package com.test.chapter6webflux.service.impl;

import com.test.chapter6webflux.model.User;
import com.test.chapter6webflux.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhouguanya
 * @Date 2018/11/07
 * @Description user接口实现
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * map初始容量为4，避免扩容
     */
    private static Map<Long,User> map = new HashMap<>(4);
    static {
        map.put(1L,new User(1L,"admin"));
        map.put(2L,new User(2L,"admin2"));
        map.put(3L,new User(3L,"admin3"));
    }

    @Override
    public Flux<User> queryAllUserList() {
        return Flux.fromIterable(map.values());
    }

    @Override
    public Mono<User> queryUserById(Long id) {
        return Mono.just(map.get(id));
    }
}
