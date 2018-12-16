package com.test.mvc.controller;

import com.test.mvc.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zhouguanya
 * @Date 2018/12/16
 * @Description
 */
@Controller
public class JsonController {
    @RequestMapping("/hello/book")
    @ResponseBody
    public Book getBook() {
        Book book = new Book();
        book.setName("Spring 5");
        book.setPrice(50);
        book.setAuthor("Michael");
        return book;
    }
}
