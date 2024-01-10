package com.sakai.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserService {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.bean");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
    }
}
