package com.sakai.spring.eg4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ShopController {
    private String status;

    public ShopController() {
        System.out.println("第一阶段：实例化，通过无参构造方法实现");
    }

    @Value("等待中")
    public void setStatus(String status) {
        this.status = status;
        System.out.println("第二阶段：属性的赋值");
    }

    @PostConstruct
    public void init() {
        System.out.println("第三阶段：初始化阶段");
    }

    @PreDestroy
    public void shutDown() {
        System.out.println("第五阶段：销毁");
    }
}
