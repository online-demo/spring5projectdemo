package com.test.jdk8.lambda;

/**
 * @Author zhouguanya
 * @Date 2018/10/11
 * @Description Lambda作用域测试
 */
public class Java8LambdaScopeDemo {

    public static void main(String[] args) {
        final String salutation = "Hello ";
        String myName = "I am Lambda ~";
        String today = "2018/10/11";
        SayHello greetingService = message -> {
            System.out.println(salutation + message + myName);
            //此处修改today将会出现编译错误
            //today = "2018/10/12";
            //此处定义局部变量myName将会出现编译错误
            //String myName = "Java";
        };
        greetingService.say("World ！");
    }

    /**
     * 打招呼接口
     */
    interface SayHello {
        /**
         * 打招呼方法
         * @param message
         */
        void say(String message);
    }
}
