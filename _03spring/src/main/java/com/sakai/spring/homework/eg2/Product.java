package com.sakai.spring.homework.eg2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    @Value("西瓜")
    private String title;
    @Value("1000")
    private Integer num;
    @Value("夏日必备")
    private String comment;

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", comment='" + comment + '\'' +
                '}';
    }
}
