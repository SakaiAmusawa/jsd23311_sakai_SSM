[TOC]

# 错误日志

## 错误信息

```
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\IntelliJ IDEA 2023.2.5\lib\idea_rt.jar=51445:C:\IntelliJ IDEA 2023.2.5\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Sakai\IdeaProjects\jsd2311_sakai_SSM\_03spring\target\classes;D:\repository\org\springframework\spring-context\6.1.2\spring-context-6.1.2.jar;D:\repository\org\springframework\spring-aop\6.1.2\spring-aop-6.1.2.jar;D:\repository\org\springframework\spring-beans\6.1.2\spring-beans-6.1.2.jar;D:\repository\org\springframework\spring-core\6.1.2\spring-core-6.1.2.jar;D:\repository\org\springframework\spring-jcl\6.1.2\spring-jcl-6.1.2.jar;D:\repository\org\springframework\spring-expression\6.1.2\spring-expression-6.1.2.jar;D:\repository\io\micrometer\micrometer-observation\1.12.1\micrometer-observation-1.12.1.jar;D:\repository\io\micrometer\micrometer-commons\1.12.1\micrometer-commons-1.12.1.jar;D:\repository\mysql\mysql-connector-java\8.0.15\mysql-connector-java-8.0.15.jar;D:\repository\com\google\protobuf\protobuf-java\3.6.1\protobuf-java-3.6.1.jar com.sakai.spring.homework.eg3.TestMapper
1月 10, 2024 7:45:41 下午 org.springframework.context.support.AbstractApplicationContext refresh
警告: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'commentMapper': Unsatisfied dependency expressed through field 'mapper': No qualifying bean of type 'com.sakai.spring.homework.eg3.Mapper' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true), @org.springframework.beans.factory.annotation.Qualifier("MapperImpl1")}
Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'commentMapper': Unsatisfied dependency expressed through field 'mapper': No qualifying bean of type 'com.sakai.spring.homework.eg3.Mapper' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true), @org.springframework.beans.factory.annotation.Qualifier("MapperImpl1")}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:787)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:767)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:145)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:508)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1418)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:325)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:323)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:975)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:960)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:625)
	at org.springframework.context.annotation.AnnotationConfigApplicationContext.<init>(AnnotationConfigApplicationContext.java:105)
	at com.sakai.spring.homework.eg3.TestMapper.main(TestMapper.java:8)
Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.sakai.spring.homework.eg3.Mapper' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true), @org.springframework.beans.factory.annotation.Qualifier("MapperImpl1")}
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoMatchingBeanFound(DefaultListableBeanFactory.java:1880)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1406)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1353)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:784)
	... 15 more

Process finished with exit code 1

```

### 关键信息

```
Error creating bean with name 'commentMapper': Unsatisfied dependency expressed through field 'mapper': No qualifying bean of type 'com.sakai.spring.homework.eg3.Mapper' available: expected at least 1 bean which qualifies as autowire candidate.
```

`翻译`
创建名称为“commentMapper”的 bean 时出错：通过字段“mapper”表示的依赖项不满意：没有类型为“com.sakai.spring.homework.eg3.Mapper”的合格
bean 可用：预计至少有 1 个 bean 有资格作为 autowire 候选。

### 错误部分代码

```java
package com.sakai.spring.homework.eg3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    @Autowired
    @Qualifier(value = "MapperImpl1")
    private Mapper mapper;
}
```

`错误点：@Qualifier(value = "MapperImpl1")`

## 错误的解决

### 错误的原因

`@Qualifier(value = "MapperImpl1") 中value的部分首字母应为小写`

### 解决

`改为： @Qualifier(value = "mapperImpl1")`