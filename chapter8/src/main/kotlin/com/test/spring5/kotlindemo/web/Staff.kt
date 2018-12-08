package com.test.spring5.kotlindemo.web

/**
 * @Author zhouguanya
 * @Date 2018/12/8
 * @Description 员工类
 */
class Staff(
        var id: Int = -1,
        var name: String = ""
) {
    override fun toString(): String {
        return "Staff(id=$id, name='$name')"
    }
}