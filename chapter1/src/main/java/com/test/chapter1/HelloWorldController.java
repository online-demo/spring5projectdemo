package com.test.chapter1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping("hello")
    public String sayHello() {
        return "Hello World";
    }
}
