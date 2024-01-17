package com.sakai._05mvcboot02.controller;

import com.sakai._05mvcboot02.mapper.UserMapper;
import com.sakai._05mvcboot02.pojo.dto.AddUserDto;
import com.sakai._05mvcboot02.pojo.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/v1/users/insert")
    @ResponseBody
    public String insert(AddUserDto addUserDto) {
        //创建一个实体类
        User user = new User();
        BeanUtils.copyProperties(addUserDto, user);
        user.setCreated(new Date());
        userMapper.insertUser(user);
        return "添加用户成功";
    }

}
