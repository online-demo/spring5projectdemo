package com.test.sourcecodelearning;

/**
 * @Author zhouguanya
 * @Date 2018/8/17
 * @Description 出版社类
 */
public class PressServiceImpl implements PressService {
    /**
     * 依赖BookService
     */
    private BookService bookService;

    /**
     * 依赖注入的地方
     * @param bookService
     */
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public String say() {
        return "本书的价格是：" + bookService.getBookPrice();
    }
}
