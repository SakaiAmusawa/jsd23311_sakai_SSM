package com.sakai.spring.eg4;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestShopController {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.eg4");
        ShopController shopController = context.getBean(ShopController.class);
        System.out.println("第四阶段：bean对象的使用");

        context.close();
    }
}
