package com.test.redis.demo.impl;

import com.alibaba.fastjson.JSON;
import com.test.redis.demo.dao.BookDao;
import com.test.redis.demo.model.Book;
import com.test.redis.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import redis.clients.jedis.JedisCluster;

/**
 * @Author: zhouguanya
 * @Date: 2019/01/05
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private JedisCluster jedisCluster;
    @Autowired
    private BookDao bookDao;
    @Override
    public int save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book query(int bookId) {
        //从缓存中查询bookId对应的Book信息
        String cachedBook = jedisCluster.get("book_" + bookId);
        //缓存未命中
        if (StringUtils.isEmpty(cachedBook)) {
            System.out.println("未命中缓存bookId = " + bookId);
            Book book = bookDao.query(bookId);
            //写入缓存，设置过期时间60秒
            jedisCluster.setex("book_" + bookId, 60, JSON.toJSONString(book));
            return book;
        } else {
            System.out.println("命中缓存bookId = " + bookId);
            return JSON.parseObject(cachedBook, Book.class);
        }
    }
}
