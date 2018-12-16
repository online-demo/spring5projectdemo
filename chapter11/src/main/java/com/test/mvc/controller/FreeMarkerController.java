package com.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zhouguanya
 * @Date 2018/12/16
 * @Description
 */
@Controller
public class FreeMarkerController {
    @RequestMapping("/hello/freemarker")
    public String hello(ModelMap map){
        map.put("msg", "Welcome to FreeMarker World");
        return "helloFreeMarker";
    }
}
