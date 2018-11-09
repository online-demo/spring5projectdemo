package com.test.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhouguanya
 * @Date 2018/11/7
 * @Description 控制器
 */
@RestController("dateController")
public class DateController {
    @Autowired
    private DateService dateService;

    @RequestMapping("/date/currentDate")
    public String getCurrentDate() {
        return dateService.queryCurrentDate();
    }
}
