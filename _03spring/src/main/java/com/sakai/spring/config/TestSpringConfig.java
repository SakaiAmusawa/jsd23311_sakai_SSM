package com.sakai.spring.config;

import com.sakai.spring.file.DataBase;
import com.sakai.spring.resource.WeiboMapper;
import com.sakai.spring.scope.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.config");
        SpringConfig springConfig = context.getBean(SpringConfig.class);
        //获取bean对象
        DataBase dataBase = context.getBean(DataBase.class);
        System.out.println(dataBase);

        WeiboMapper weiboMapper = context.getBean(WeiboMapper.class);
        System.out.println(weiboMapper);

        UserController userController = context.getBean(UserController.class);
        System.out.println(userController);
    }
}
