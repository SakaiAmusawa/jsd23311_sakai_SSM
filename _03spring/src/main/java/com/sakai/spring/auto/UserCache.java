package com.sakai.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserCache {
    /*
    Autowired注解：只能根据类型进行装配，不能根据Bean对象的名称进行装配
    如果体格接口有多个实现类，需要结合Qualifier注解根据Bean对象名称进行装配
    Qualifier注解：
        配合Autowired注解
        value参数值得是IoC容器中Spring Bean 对象的名称
     */
    @Autowired
    @Qualifier(value = "cacheImpl1")
    private Cache cache;
}
