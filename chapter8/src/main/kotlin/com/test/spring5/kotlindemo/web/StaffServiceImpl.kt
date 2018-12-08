package com.test.spring5.kotlindemo.web

import org.springframework.stereotype.Service

/**
 * @Author zhouguanya
 * @Date 2018/12/8
 * @Description 员工接口实现类
 */
@Service
class StaffServiceImpl : StaffService {
    override fun findByName(name: String): Staff {
        return Staff(100, name)
    }
}