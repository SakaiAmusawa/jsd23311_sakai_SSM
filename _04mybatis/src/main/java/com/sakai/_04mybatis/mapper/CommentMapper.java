package com.sakai._04mybatis.mapper;

import com.sakai._04mybatis.pojo.entity.Comment;
import com.sakai._04mybatis.pojo.vo.VOComment1;
import com.sakai._04mybatis.pojo.vo.VOComment2;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface CommentMapper {
    //@Insert("INSERT INTO blog.comment( CONTENT, CREATED, USER_ID, WEIBO_ID )VALUES (#{content},#{created},#{userId},#{weiboId})")
    int insert(Comment comment);

    //    @Delete("DELETE FROM blog.comment WHERE id = #{id}")
    int delete(int id);

    //    @Update("UPDATE blog.comment SET content = #{content},created = #{created} WHERE id =#{id}  ")
    int update(Comment comment);

    //    @Select("SELECT content,user_id userId,weibo_id weiboId FROM comment WHERE id = #{id}")
    VOComment1 select1(int id);

    //    @Select("SELECT content,user_id userId FROM comment WHERE weibo_id = #{id}")
    List<VOComment2> select2(int id);

    /*
    动态删除：
        方式一：数组的方式
            动态删除评论表中的相关信息。
     */

    int deleteByIds1(Integer[] ids);

    /*
    方法二：集合方式
    */
    int deleteByIds2(ArrayList<Integer> list);

    /*
     * 动态修改：根据评论id动态修改评论信息
     */

    int dynamicUpdate(Comment comment);

    /*
    统计评论的数量
     */
    int selectAll();
}
