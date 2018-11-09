package com.test.resttemplate;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author zhouguanya
 * @Date 2018/11/7
 * @Description DateService接口实现
 */
@Service
public class DateServiceImpl implements DateService {
    /**
     * 当前日期
     */
    @Override
    public String queryCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return "Today is " + format.format(new Date());
    }
}
