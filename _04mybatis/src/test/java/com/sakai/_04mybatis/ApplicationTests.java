package com.sakai._04mybatis;

import com.sakai._04mybatis.mapper.UserMapper;
import com.sakai._04mybatis.mapper.WeiboMapper;
import com.sakai._04mybatis.pojo.entity.User;
import com.sakai._04mybatis.pojo.entity.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

//@SpringBootTest 表明是一个springboot的测试方法
@SpringBootTest
class ApplicationTests {

    //自动装配
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private WeiboMapper weiboMapper;


    /**
     * 测试方法：向用户表中插入一条信息
     */
    @Test
    void insertUserTest() {
        User user = new User();
        user.setUsername("zjw");
        user.setPassword("zjw3016");
        user.setNickname("sakai");
        user.setCreated(new Date());

        userMapper.insertUser(user);

    }

    @Test
    void insertWeiboTest() {
        Weibo weibo = new Weibo();
        weibo.setContent("Hello");
        weibo.setCreated(new Date());
        weibo.setUserId(3016L);

        System.out.println(weiboMapper.insertWeibo(weibo));
    }

    @Test
    void deleteWeiboTest() {
        System.out.println(weiboMapper.deleteWeibo(206));
    }

    @Test
    void updateWeiboTest() {
        Weibo weibo = new Weibo();
        weibo.setContent("细雨淋淋，敲打我心");
        weibo.setCreated(new Date());
        weibo.setId(200L);
        weiboMapper.updateWeibo(weibo);
    }

    @Test
    void selectWeiboTest() {
        System.out.println(weiboMapper.selectWeibo(200));
    }

    @Test
    void selectAllTest() {
        System.out.println(weiboMapper.selectAll());
    }

    @Test
    void selectColumns() {
        System.out.println(weiboMapper.selectColumns(200L));
    }


    @Test
    void eg7Test() {
        System.out.println(weiboMapper.selecteg7(100L));
    }

}
