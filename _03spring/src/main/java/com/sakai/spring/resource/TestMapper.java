package com.sakai.spring.resource;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMapper {
    @Test
    public void testMapper() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.resource");
        WeiboMapper weiboMapper = context.getBean(WeiboMapper.class);
        System.out.println(weiboMapper);
    }
}
