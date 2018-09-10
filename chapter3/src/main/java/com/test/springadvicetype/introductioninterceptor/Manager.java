package com.test.springadvicetype.introductioninterceptor;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * @Author zhouguanya
 * @Date 2018/9/2
 * @Description 经理类
 */
public class Manager extends DelegatingIntroductionInterceptor implements Management {

    @Override
    public void manage(String name) {
        System.out.println(name + "，您好，我是经理，负责管理服务员");
    }
}
