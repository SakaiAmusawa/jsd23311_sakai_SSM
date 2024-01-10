package com.sakai.spring.homework.eg3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    @Autowired
    @Qualifier(value = "mapperImpl1")
    private Mapper mapper;
}
