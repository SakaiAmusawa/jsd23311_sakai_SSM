package com.sakai.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解：标识此类为配置类，spring会自动加载此类
 * <p>
 * ComponentScan注解：自动扫描注解；
 * 说明:
 * <p>
 * 1.指定包的扫描路径，Spring会自动扫描该包及其子孙包下的所有的类；
 * 2.为添加着相关注解[4个注解]的类创建spring bean对象放到IoC容器中
 * <p>
 * 这是一个典型的Spring配置类（Configuration class），用于配置Spring容器的相关设置。让我们逐步解释这个配置类的各个部分：
 * <p>
 * /@Configuration 注解：
 * <p>
 * 此注解表明该类是一个配置类，Spring会在应用启动时自动加载并处理该类中的配置信息。
 * 通常，@Configuration 注解用于标识一个类，该类包含用于配置Spring容器的Bean的方法。
 * <p>
 * /@ComponentScan 注解：
 * <p>
 * 此注解用于启用组件扫描，Spring会在指定的包及其子包中查找带有相关注解的类，并将它们注册为Spring Bean。
 * 在这个例子中，value = "com.sakai.spring" 指定了要扫描的基础包路径。
 * 总结一下，这个配置类告诉Spring容器在 com.sakai.spring 包及其子包中查找带有Spring相关注解的类，并将它们注册为Spring Bean。这些被注册的Bean将被Spring容器管理，可以通过依赖注入等方式在应用中使用。
 * <p>
 * 在实际应用中，通常会有其他配置类或XML配置文件，用于配置数据源、事务管理、AOP等方面的内容。这个类主要负责启用组件扫描，从而将带有注解的类纳入Spring容器的管理。
 */
@Configuration
@ComponentScan(value = "com.sakai.spring")
public class SpringConfig {
}
