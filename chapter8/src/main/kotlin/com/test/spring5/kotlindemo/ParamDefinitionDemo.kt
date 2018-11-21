package com.test.spring5.kotlindemo

/**
 * 字符串模版的使用
 */
fun printAge(age: Int): String {
    // 模板中的简单名称
    val lastYear = "my age is $age last year"
    // 模板中的任意表达式：
    val thisYear = "${lastYear.replace("is", "was")}, but now I am ${age + 1}"
    return thisYear
}

/**
 * 空值处理函数
 */
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

/**
 * 字符串乘法
 */
fun multiplicationString(arg1: String, arg2: String) {
    // 将字符串转为Int
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // 对 x 和 y 做非空判断
    if (x != null && y != null) {
        // 打印 x * y 的值
        println(x * y)
    }
    else {
        println("参数异常，'$arg1' 或 '$arg2' 不是数字")
    }
}

/**
 * 区间操作函数
 */
fun range(): Unit {
    // 等同于 i >= 1 && i <= 10
    for (i in 1..10) print("$i\t")
    println("\n------分割线------")
    // 什么都不输出
    for (i in 10..1) print("$i\t")
    println("\n------分割线------")
    // 使用 step 指定步长 等同于 i >= 1; i <= 10; i += 2
    for (i in 1..10 step 2) print("$i\t")
    println("\n------分割线------")
    // 等同于 i <= 10; i >= 1; i -= 2
    for (i in 10 downTo 1 step 2) print("$i\t")
    println("\n------分割线------")
    // 使用 until 函数排除结束元素
    // i in [1, 10) 排除了 10
    for (i in 1 until 10) {
        print("$i\t")
    }
    println("\n------分割线------")
}

/**
 * for循环迭代集合
 */
fun collection(): Unit {
    val items = listOf("a", "b", "c")
    for (item in items) {
        println(item)
    }
    // 使用in运算符
    val fruits = setOf("apple", "banana", "pear")
    when {
        "orange" in fruits -> println("orange is yellow")
        "apple" in fruits -> println("apple is red")
    }
}

fun main(args: Array<String>) {
    println(printAge(10))
    println("------分割线------")
    multiplicationString("3", "5")
    println("------分割线------")
    multiplicationString("hello", "3")
    println("------分割线------")
    range()
    collection()
}