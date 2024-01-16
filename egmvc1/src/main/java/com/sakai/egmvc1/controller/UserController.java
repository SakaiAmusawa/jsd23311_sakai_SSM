package com.sakai.egmvc1.controller;

import com.sakai.egmvc1.pojo.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    /*
    加用户-接口说明

    用户将：用户名、密码、昵称 数据传递给服务端，服务端处理请求。

     * 请求地址：/v1/users/insert
     * 请求方法：POST
     * 请求体数据：用户名username、密码password、昵称nickname【服务端终端打印】
     * 返回响应：String "添加用户成功"
     */
    @RequestMapping("/v1/users/insert")
    @ResponseBody
    public String insert(UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        String nickname = userDTO.getNickname();
        return "用户添加成功" + "username = " + username + " password = " + password + " nickname = " + nickname;
    }
    /*
        用户列表-接口说明

     * 请求地址：`/v1/users/userList`
     * 请求方法：GET
     * 查询参数：无
     * 返回响应：String "查询用户列表成功"
     */

    @RequestMapping("/v1/users/userList")
    @ResponseBody
    public String userList() {
        return "查询用户列表成功";
    }

    /*
      删除用户-接口说明

     * 请求地址：/v1/users/delete
     * 请求方法：GET
     * 查询参数：用户id
     * 返回响应：String "删除成功，用户id为：数字"
     */
    @RequestMapping("/v1/users/delete")
    @ResponseBody
    public String delete(Integer id) {
        return "删除成功，用户ID为" + id;
    }
    /*
    更新用户-接口说明

     * 请求地址：/v1/users/update
     * 请求方法：POST
     * 请求体数据：用户id、用户名username、密码password、昵称nickname 【终端打印数据】
     * 返回响应：String "更新成功"
     */

    @RequestMapping("/v1/users/update")
    @ResponseBody
    public String update(Integer id, UserDTO userDTO) {
        id = 1;
        String password = userDTO.getPassword();
        String nickname = userDTO.getNickname();
        String username = userDTO.getUsername();
        return "更新成功"
                + id + username + password + nickname;
    }
}
