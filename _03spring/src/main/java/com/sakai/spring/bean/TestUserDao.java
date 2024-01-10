package com.sakai.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        //                                                                                        包名
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.bean");
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
    }
}
