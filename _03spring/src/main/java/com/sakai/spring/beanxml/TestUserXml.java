package com.sakai.spring.beanxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用xml方式创建一个对象
 */
public class TestUserXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserXml userXml = context.getBean(UserXml.class);
        System.out.println(userXml);
        //通过ID获取,需要强转类型(非常用方式）
        UserXml userXml1 = (UserXml) context.getBean("userXml");
        System.out.println(userXml1);
    }
}
