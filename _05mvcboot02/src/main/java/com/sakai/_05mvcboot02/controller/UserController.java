package com.sakai._05mvcboot02.controller;

import com.sakai._05mvcboot02.mapper.UserMapper;
import com.sakai._05mvcboot02.pojo.dto.AddUserDto;
import com.sakai._05mvcboot02.pojo.entity.User;
import com.sakai._05mvcboot02.pojo.vo.UserListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/*@Controller
@ResponseBody
这两个注解等效与下面的注解
*/
@RestController//组合注解
@RequestMapping("/v1/users/")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("insert")
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

    @RequestMapping("userList")
    public List<UserListVO> selectUser() {
        /*
        请求地址：/v1/users/userList
        请求方法：GET
        查询参数：无
        返回响应：List<UserListVO> 显示: 用户名username 和 密码password
         */
        return userMapper.selectUser();
    }

    @RequestMapping("delete")
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

    @RequestMapping("update")
    public String updateUser(User user) {
        /*
        请求地址：/v1/users/update
        请求方法：POST
        请求体数据：用户id、用户名username、密码password、昵称nickname、时间created
        返回响应：String "修改成功"
         */
        user.setCreated(new Date());
        userMapper.updateUser(user);

        return "修改成功";
    }

}
