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
    void selectDetail() {
        System.out.println(weiboMapper.selectDetail(204));
    }

}
