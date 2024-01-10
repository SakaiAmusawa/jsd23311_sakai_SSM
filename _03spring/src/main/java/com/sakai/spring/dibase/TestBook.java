package com.sakai.spring.dibase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
        Book book = context.getBean(Book.class);
        System.out.println(book);
    }
}
