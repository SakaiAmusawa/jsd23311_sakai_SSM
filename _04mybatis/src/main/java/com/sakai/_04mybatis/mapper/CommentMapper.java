package com.sakai._04mybatis.mapper;

import com.sakai._04mybatis.pojo.entity.Comment;
import com.sakai._04mybatis.pojo.vo.VOComment1;
import com.sakai._04mybatis.pojo.vo.VOComment2;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Insert("INSERT INTO blog.comment( CONTENT, CREATED, USER_ID, WEIBO_ID )VALUES (#{content},#{created},#{userId},#{weiboId})")
    int insert(Comment comment);

    @Delete("DELETE FROM blog.comment WHERE id = #{id}")
    int delete(int id);

    @Update("UPDATE blog.comment SET content = '进行修改操作' WHERE id =#{id}  ")
    int update(int id);

    @Select("SELECT content,user_id userId,weibo_id weiboId FROM comment WHERE id = #{id}")
    VOComment1 select1(int id);

    @Select("SELECT content,user_id userId FROM comment WHERE weibo_id = #{id}")
    List<VOComment2> select2(int id);
}
