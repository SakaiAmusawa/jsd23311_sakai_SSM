package com.sakai._04mybatis;

import com.sakai._04mybatis.mapper.WeiboMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WeiboTest {

    @Autowired
    private WeiboMapper weiboMapper;

    @Test
    void selectIndexTest() {
        System.out.println(weiboMapper.selectIndex());
    }

    @Test
    void selectDetailTest() {
        System.out.println(weiboMapper.selectDetail(204));
    }

    @Test
    void commentListTest() {
        System.out.println(weiboMapper.commentList(200));
    }

    @Test
    void selectByWidTest() {
        System.out.println(weiboMapper.selectByWid(200));
    }

    @Test
    void SelectWeiboInfoByUserIdTest() {
        System.out.println(weiboMapper.selectMap2(100));
    }

    @Test
    void selectMap3Test() {
        System.out.println(weiboMapper.selectMap3(200));
    }

    @Test
    void selectMap4Test() {
        System.out.println(weiboMapper.selectMap4(200));
    }
}
