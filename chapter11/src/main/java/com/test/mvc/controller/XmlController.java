package com.test.mvc.controller;

import com.test.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zhouguanya
 * @Date 2018/12/16
 * @Description
 */
@Controller
public class XmlController {
    @RequestMapping("/hello/xml")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setUserName("Michael");
        user.setUserAge(20);
        return user;
    }
}
