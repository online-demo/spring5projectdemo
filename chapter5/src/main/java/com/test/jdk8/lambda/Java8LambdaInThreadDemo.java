package com.test.jdk8.lambda;

/**
 * @Author zhouguanya
 * @Date 2018/10/12
 * @Description 测试Lambda表达式配合线程使用
 */
public class Java8LambdaInThreadDemo {

    public static void main(String[] args) throws Exception {
        // 不使用Lambda表达式，使用匿名类
        // 或者定义一个类实现Runnable接口
        new Thread(new Runnable() {
            @Override
            public void run () {
                System.out.println("线程1");
            }
        }).start();

        // 使用lambda表达式
        new Thread(() ->System.out.println("线程2")).start();

    }
}
