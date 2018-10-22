package com.test.jdk8.lambda;

/**
 * @Author zhouguanya
 * @Date 2018/10/11
 * @Description LambdaTest
 */
public class Java8LambdaDemo {

    public static void main(String[] args){
        Java8LambdaDemo java8LambdaDemo = new Java8LambdaDemo();
        // 类型声明
        Calculator addition = (int a, int b) -> a + b;
        // 不用类型声明
        Calculator subtraction = (a, b) -> a - b;
        // 大括号中的返回语句
        Calculator multiplication = (int a, int b) -> { return a * b; };
        // 没有大括号及返回语句
        Calculator division = (int a, int b) -> a / b;
        // 测试用例
        System.out.println("100 + 50 = " + java8LambdaDemo.operate(100, 50, addition));
        System.out.println("100 + 50 = " + addition.calculate(100, 50));
        System.out.println("100 - 50 = " + java8LambdaDemo.operate(100, 50, subtraction));
        System.out.println("100 x 50 = " + java8LambdaDemo.operate(100, 50, multiplication));
        System.out.println("100 / 50 = " + java8LambdaDemo.operate(100, 50, division));
    }

    /**
     * 算术运算接口
     */
    interface Calculator {
        /**
         * 数学运算操作
         * @param a 第一个操作数
         * @param b 第二个操作数
         * @return int
         */
        int calculate(int a, int b);
    }

    /**
     * 操作方法
     * @param a
     * @param b
     * @param calculator MathOperation对象
     * @return int
     */
    private int operate(int a, int b, Calculator calculator){
        return calculator.calculate(a, b);
    }
}
