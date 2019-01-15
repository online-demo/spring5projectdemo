package com.test.redis.demo.service;


import com.test.redis.demo.model.Book;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/05
 * @Description:
 */
public interface BookService {
    int save(Book book);
    Book query(int id);
}
