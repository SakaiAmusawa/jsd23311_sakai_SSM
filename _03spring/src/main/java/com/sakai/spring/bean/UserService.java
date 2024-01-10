package com.sakai.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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
