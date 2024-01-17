package com.sakai._05mvcboot02.mapper;


import com.sakai._05mvcboot02.pojo.entity.User;
import com.sakai._05mvcboot02.pojo.vo.UserListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //插入用户
    int insertUser(User user);

    //查询所有用户的用户名和密码
    List<UserListVO> selectUser();

    int deleteUser(Integer id);

    int updateUser(User user);
}
