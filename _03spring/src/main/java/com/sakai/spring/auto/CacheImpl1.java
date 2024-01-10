package com.sakai.spring.auto;

import org.springframework.stereotype.Component;

//加入一个参数，表示在IoC容器中的名字
@Component(value = "aaa")
public class CacheImpl1 implements Cache {
}
