package com.sakai._04mybatis;

import com.sakai._04mybatis.mapper.CommentMapper;
import com.sakai._04mybatis.pojo.entity.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;

@SpringBootTest
public class CommentTests {
    @Autowired
    private CommentMapper commentMapper;

    @Test
    void insertTest() {
        Comment comment = new Comment();
        comment.setContent("这是一条评论");
        comment.setCreated(new Date());
        comment.setUserId(100L);
        comment.setWeiboId(200L);

        System.out.println(commentMapper.insert(comment));
    }

    @Test
    void deleteTest() {
        System.out.println(commentMapper.delete(305));
    }

    @Test
    void updateTest() {
        Comment comment = new Comment();
        comment.setId(300L);
        comment.setContent("修改评论");
        comment.setCreated(new Date());
        System.out.println(commentMapper.update(comment));
    }

    @Test
    void select1Test() {
        System.out.println(commentMapper.select1(300));
    }

    @Test
    void select2Test() {
        System.out.println(commentMapper.select2(200));
    }

    @Test
    void deleteByIdsTest1() {
        Integer[] integers = new Integer[]{301, 303};
        System.out.println(commentMapper.deleteByIds1(integers));
    }

    @Test
    void deleteByIds2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(301);
        list.add(302);
        System.out.println(commentMapper.deleteByIds2(list));
    }
}
