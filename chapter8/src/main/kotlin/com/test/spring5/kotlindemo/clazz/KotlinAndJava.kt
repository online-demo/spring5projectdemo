package com.test.spring5.kotlindemo.clazz
/**
 * @Author zhouguanya
 * @Date 2018/12/8
 * @Description
 */
class KotlinAndJava {
    /**
     * Kotlin与Java互操作
     */
    fun kotlinJavaInteract(source: java.util.ArrayList<Int>) {
        val list = ArrayList<Int>()
        // 使用Java中for遍历集合
        for (item in source) {
            list.add(item)
        }
        System.out.println(list)
        System.out.println("------分隔符------")
        // kotlin操作符遍历集合
        for (i in 0 until source.size) {
            System.out.println(source[i])
        }
    }
}


fun main(args: Array<String>) {
    val city = KotlinAndJava()
    // 使用Java中的ArrayList类
    val list = java.util.ArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    city.kotlinJavaInteract(list)
}