package com.sakai.spring.life;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestOrder {
    @Test
    public void testOrder() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sakai.spring.life");
        Order order = context.getBean(Order.class);
        System.out.println("4使用阶段，通过getBean方法获取");

        //关闭IoC容器
        context.close();//生命周期的销毁

    }
}
