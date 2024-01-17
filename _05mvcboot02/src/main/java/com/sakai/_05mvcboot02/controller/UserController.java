package com.sakai._05mvcboot02.controller;

import com.sakai._05mvcboot02.mapper.UserMapper;
import com.sakai._05mvcboot02.pojo.dto.AddUserDto;
import com.sakai._05mvcboot02.pojo.entity.User;
import com.sakai._05mvcboot02.pojo.vo.UserListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/v1/users/insert")
    @ResponseBody
    public String insert(AddUserDto addUserDto) {
        /*
            用户将：用户名、密码、昵称 数据传递给服务端，服务端处理请求并将数据存入数据表。
            请求地址：/v1/users/insert
            请求方法：POST
            请求体数据：用户名username、密码password、昵称nickname
            返回响应：添加成功
         */
        //创建一个实体类
        User user = new User();
        //复制属性  将客户端发送的数据addUserDto --->User实体类的对象
        BeanUtils.copyProperties(addUserDto, user);
        user.setCreated(new Date());
        userMapper.insertUser(user);
        return "添加用户成功";
    }

    @RequestMapping("/v1/users/userList")
    @ResponseBody
    public List<UserListVO> selectUser() {
        return userMapper.selectUser();
    }

    @RequestMapping("/v1/users/delete")
    @ResponseBody
    public String deleteUser(Integer id) {
        /*
        请求地址：/v1/users/delete?id=用户id
        请求方法：GET
        查询参数：用户id
        返回响应：String "删除成功"
         */
        userMapper.deleteUser(id);
        return "删除成功";
    }

}
