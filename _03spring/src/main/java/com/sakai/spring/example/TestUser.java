package com.sakai.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * 测试
 */
public class TestUser {
    public static void main(String[] args) {
        /*
            通过spring创建一个对象
                1.创建IoC容器
                2.获取对象
                3.调用方法
         */
        //创建一个IoC容器，通过扫描注解的方式(AnnotationConfigApplicationContext)获取类
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.example");//复制包名的快捷键CTRL+shift+alt+c
        User user = context.getBean(User.class);
        user.run();

        //通过new的方式创建一个对象，并调用方法
        User user1 = new User();
        user1.run();

        //通过反射的方法创建一个对象
        try {
            Class<?> cls = Class.forName("com.sakai.spring.example.User");
            User user2 = (User) cls.getDeclaredConstructor().newInstance();
            user2.run();
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
