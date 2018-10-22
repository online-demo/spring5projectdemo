package com.test.traditionalprogram;

/**
 * @Author zhouguanya
 * @Date 2018/10/10
 * @Description 传统编程模型 暂不考虑重排序
 */
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        //c d有依赖关系
        int c = a + b;
        //如果c没有执行完，d就不能执行
        //对应企业开发场景中，如果c是一个远程调用，d是对远程调用结果进行分析
        //那么d只能等待c的结果，造成d后的程序都必须同步等待
        int d = c / 3;
        System.out.println(c);
        System.out.println(d);
    }
}
