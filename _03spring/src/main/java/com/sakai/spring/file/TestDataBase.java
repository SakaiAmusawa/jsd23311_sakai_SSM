package com.sakai.spring.file;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDataBase {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.file");
        DataBase base = context.getBean(DataBase.class);
        System.out.println(base);
    }
}
