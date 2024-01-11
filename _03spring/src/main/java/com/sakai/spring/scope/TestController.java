package com.sakai.spring.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestController {
    @Test
    public void testController() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.scope");
        UserController bean1 = context.getBean(UserController.class);
        System.out.println(bean1);
        UserController bean2 = context.getBean(UserController.class);
        System.out.println(bean2);

        /*
        单例和多例的测试
        内存地址相同为单例
        内存地址不同为多例
         */
        if (bean1 == bean2) {
            System.out.println("这是单例模式");
        } else {
            System.out.println("这是多例模式");
        }
    }
}
