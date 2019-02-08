package com.test.mediator;

import java.util.Date;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description: 论坛
 */
public class BBS {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
