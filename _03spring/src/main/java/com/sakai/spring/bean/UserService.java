package com.sakai.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Autowired注解：自动装配，注入对象和接口类型数据
 * 1.添加到方法上
 * 2.添加到set方法上
 * 3.添加到构造方法上
 */
@Service
public class UserService {

    @Value("登入功能")
    private String name;

    @Autowired
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" + "name='" + name + '\'' + ", userDao=" + userDao + '}';
    }
}
