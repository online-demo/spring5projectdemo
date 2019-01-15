package com.test.redis.demo.dao;

import com.test.redis.demo.model.Book;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/05
 * @Description:
 */
public interface BookDao {
    int save(Book book);
    Book query(int id);
}
