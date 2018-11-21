package com.test.spring5.kotlindemo

/**
 * 具有两个Int类型的入参和Int返回值的sum方法
 */
fun addition(a: Int, b: Int): Int {
    return a + b
}

/**
 * 类型自动推断的substract方法
 */
fun subtraction(a: Int, b: Int) = a - b

/**
 * 无返回值的multiplication方法
 */
fun multiplication(a: Int, b: Int): Unit {
    println(a + b)
}

/**
 * 可变长参数函数的variableParam方法
 */
fun variableParam(vararg v:Int){
    for(vt in v){
        println(vt)
    }
}

fun main(args: Array<String>) {
    println("1 + 2 = " + addition(1, 2))
    println("------分割线------")
    println("1 - 2 = " + subtraction(1, 2))
    println("------分割线------")
    print("1 + 2 = ")
    multiplication(1, 2)
    println("------分割线------")
    variableParam(1, 2, 3)
    println("------分割线------")
    // lambda 匿名函数
    val division: (Int, Int) -> Int = {x, y -> x / y}
    println("4 / 2 = " + division(4, 2))
}