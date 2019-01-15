package com.test.demo;

import com.alibaba.fastjson.JSON;
import com.test.redis.demo.model.Book;
import com.test.redis.demo.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author: zhouguanya
 * @Date: 2019/01/05
 * @Description: 测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-redis.xml", "classpath:spring-book.xml"})
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testSave() {
        Book book = new Book();
        book.setName("Spring 5 Programming");
        book.setPrice(50);
        bookService.save(book);
    }
    @Test
    public void testQuery() {
        Book book = bookService.query(1);
        System.out.println("bookId = 1的详情 = " + JSON.toJSONString(book));
    }
}
