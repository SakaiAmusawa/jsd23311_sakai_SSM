package com.sakai.spring.life;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Order {
    private String status;

    public Order() {
        System.out.println("1实例化阶段，无参构造执行完成");
    }

    public Order(String status) {
        this.status = status;
    }


    /**
     * 设置
     *
     * @param status 测试用随意填写
     */
    @Value("等待买家付款")
    public void setStatus(String status) {
        this.status = status;
        System.out.println("2属性赋值阶段，set方法执行完成");
    }

    @PostConstruct
    public void init() {
        System.out.println("3生命周期初始化方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("5生命周期的销毁方法");
    }

    public String toString() {
        return "Order{status = " + status + "}";
    }
}
