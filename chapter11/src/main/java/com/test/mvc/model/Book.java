package com.test.mvc.model;

/**
 * @Author zhouguanya
 * @Date 2018/12/16
 * @Description
 */
public class Book {
    private String name;
    private int price;
    private String author;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
