package com.sakai.spring.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Resource的装配规则： <p>
 * 根据Spring Bean对象名称进行装配
 * <p>
 * 如果未指定name参数，则会使用Spring Bean对象名称装配
 * <p>
 * 如果属性名称和Spring Bean对象名称也不一样，则会根据类型进行装配
 */

@Component
public class WeiboMapper {
/*    @Autowired
    @Qualifier(value = "resMapperImpl1")*/

    //正确的 添加了name参数
    @Resource(name = "resMapperImpl1")
    private ResMapper resMapper;

/*
    //正确的 不添加name参数，修改了属性的名称
    @Resource
    private ResMapper resMapperImpl1;*/

/*
    //错误的
    @Resource
    private ResMapper resMapper;*/
}
