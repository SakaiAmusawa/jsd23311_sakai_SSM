package com.sakai._04mybatis.mapper;

import com.sakai._04mybatis.pojo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    //在mybatis中的占位符为 #{}
//    @Insert("INSERT INTO blog.user(username, password, nickname, created) VALUES (#{username},#{password},#{nickname},#{created})")
    void insertUser(User user);
}
