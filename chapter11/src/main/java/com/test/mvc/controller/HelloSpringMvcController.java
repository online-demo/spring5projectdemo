package com.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author zhouguanya
 * @Date 2018/12/15
 * @Description
 */
@Controller
@RequestMapping("/hello/springmvc")
public class HelloSpringMvcController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Welcome to Spring MVC");
        return "hellospringmvc";
    }

}
