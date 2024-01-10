package com.sakai.spring.homework.eg3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMapper {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.homework.eg3");
        CommentMapper commentMapper = context.getBean(CommentMapper.class);
        System.out.println(commentMapper);
    }
}
