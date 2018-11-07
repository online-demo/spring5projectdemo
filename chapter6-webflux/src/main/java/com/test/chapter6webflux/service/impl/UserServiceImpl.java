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
     * 注意：
     * 一般企业开发中需要指定容器大小，避免频繁扩容
     * 此例中map初始容量为4，避免扩容（默认负载因子0.75）
     * 如果不指定，则会使用默认大小，即16，造成空间浪费
     */
    private static Map<Long,User> userMap = new HashMap<>(4);
    static {
        userMap.put(1L,new User(1L,"admin"));
        userMap.put(2L,new User(2L,"admin2"));
        userMap.put(3L,new User(3L,"admin3"));
    }

    @Override
    public Flux<User> queryAllUserList() {
        return Flux.fromIterable(userMap.values());
    }

    @Override
    public Mono<User> queryUserById(Long id) {
        return Mono.just(userMap.get(id));
    }
}
