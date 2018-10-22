package com.test.sourcecodelearning;

/**
 * @Author zhouguanya
 * @Date 2018/100/3
 * @Description 目标对象
 */
public class Target implements Log {

    /**
     * 操作方法
     */
    @Override
    public void printLog() {
        try {
            //模拟一个耗时1秒的操作
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行一些操作");
    }
}
