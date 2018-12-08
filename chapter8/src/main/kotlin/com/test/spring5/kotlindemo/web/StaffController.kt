package com.test.spring5.kotlindemo.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Author zhouguanya
 * @Date 2018/12/8
 * @Description 员工控制器
 */
@RestController
class StaffController(private val manService:StaffService) {

    @GetMapping("/staff/find")
    fun home(): String {
        val staff = manService.findByName("michael")
        return "staff id = "+ staff.id + ", staff name = " + staff.name
    }

}