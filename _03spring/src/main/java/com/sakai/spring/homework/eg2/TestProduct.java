package com.sakai.spring.homework.eg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProduct {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.homework.eg2");
        Product product = context.getBean(Product.class);
        System.out.println(product);
    }
}
