package com.test.spring5.kotlindemo.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @Author zhouguanya
 * @Date 2018/12/8
 * @Description 启动类
 */
@SpringBootApplication
open class SpringBootWithKotlinApplication fun main(args: Array<String>) {

    SpringApplication.run(SpringBootWithKotlinApplication::class.java, *args)

}