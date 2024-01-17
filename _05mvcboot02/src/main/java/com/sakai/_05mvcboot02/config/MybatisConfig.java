package com.sakai._05mvcboot02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*
@Configuration 标识此类为配置类，Spring会自动加载此类
@MapperScan 自动扫描注解；
    1. 会自动扫描指定包路径及子孙包中的所有接口，自动为其添加@Mapper注解；
    2. 设置
 */
@Configuration
@MapperScan(value = "com.sakai._05mvcboot02")
public class MybatisConfig {
}
