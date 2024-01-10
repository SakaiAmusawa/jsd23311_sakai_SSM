package com.sakai.spring.example;


import org.springframework.stereotype.Component;

/**
 * Component注解：将该类表示为Spring组件，未来Spring框架为此类创建对象
 */
@Component
public class User {
    public void run() {
        System.out.println("Hello");
    }
}
