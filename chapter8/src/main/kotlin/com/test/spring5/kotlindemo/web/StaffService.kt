package com.test.spring5.kotlindemo.web

/**
 * @Author zhouguanya
 * @Date 2018/12/8
 * @Description 员工接口
 */
interface StaffService  {
    fun findByName(name: String): Staff
}