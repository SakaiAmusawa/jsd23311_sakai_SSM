package com.sakai.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    /*
     * @Value:简单类型属性值注入；
     * 1、添加在属性上
     * 2、添加在set方法上
     */
    @Value("jdbc:mysql://localhost:3306/sakai")
    private String url;

    @Value("root")
    private String username;
    //@Value("root")
    private String password;

    @Value("root")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDao{" + "url='" + url + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }
}
