package com.sakai._05mvcboot02.mapper;


import com.sakai._05mvcboot02.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(User user);
}
