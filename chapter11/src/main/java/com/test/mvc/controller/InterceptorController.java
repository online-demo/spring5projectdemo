package com.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zhouguanya
 * @Date 2018/12/17
 * @Description SpringMVC拦截器使用
 */
@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello interceptor";
    }

    @RequestMapping("/bye")
    @ResponseBody
    public String world() {
        return "bye bye interceptor";
    }
}
