package com.sakai.spring.dibase;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void bookTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
        Book book = context.getBean(Book.class);
        System.out.println(book);
    }
}
