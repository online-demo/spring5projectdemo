package com.test.spring5.kotlindemo.clazz

/**
 * @Author zhouguanya
 * @Date 2018/11/23
 * @Description Kotlin类和对象
 */
class User constructor(name: String){
    var userAge: Int = 20
    var userName = name
    // 初始化代码
    init {
        println("init code executed")
    }
    /**
     * 次构造函数
     */
    constructor (name: String, age: Int) : this(name) {
        userName = name
        userAge = age
        println("my name is $userName, i am $userAge years old.")
    }

    /**
     * sayHello方法
     */
    fun sayHello() {
        println("$userName say hello world")
    }

}

fun main(args: Array<String>) {
    val allen = User("allen")
    println(allen.userAge)
    println(allen.userName)
    allen.sayHello()
    println("------分割线------")
    val michael =  User("michael", 24)
    println(michael.userAge)
    println(michael.userName)
    michael.sayHello()

}