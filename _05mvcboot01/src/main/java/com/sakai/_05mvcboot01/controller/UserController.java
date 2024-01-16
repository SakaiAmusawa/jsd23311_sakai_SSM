package com.sakai._05mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Controller注解：将此类标识为控制器，用于接受用户请求
@Controller
public class UserController {
    /**
     * @RequestMapping 请求注解，根据请求的URL地址锁定对应的控制器方法
     * @ResponseBody 响应注解，
     * 1. 允许控制器方法以返回值的形式返回给客户端
     */
    @RequestMapping("/v1/users/login")

    @ResponseBody
    public String login() {
        return "successful";
    }
}
