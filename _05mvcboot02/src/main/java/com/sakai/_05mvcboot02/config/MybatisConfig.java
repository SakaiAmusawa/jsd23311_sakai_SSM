package com.sakai._05mvcboot02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*
@Configuration 标识此类为配置类，Spring会自动加载此类
@MapperScan 自动扫描注解；
    1. 会自动扫描指定包路径及子孙包中的所有接口，自动为其添加@Mapper注解；
    2. 设置自动扫描后,所有的接口上无需再添加 @Mapper 注解.
 */
@Configuration
@MapperScan(value = "com.sakai._05mvcboot02")
public class MybatisConfig {
}
