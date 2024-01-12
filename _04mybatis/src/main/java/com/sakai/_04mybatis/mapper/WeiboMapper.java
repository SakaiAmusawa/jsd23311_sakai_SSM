package com.sakai._04mybatis.mapper;

import com.sakai._04mybatis.pojo.entity.Weibo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeiboMapper {
    @Insert("INSERT INTO blog.weibo(content, created, user_id) VALUES (#{content},#{created},#{userId})")
    int insertWeibo(Weibo weibo);

    /*
    根据微博的ID删除指定的微博信息
    补充：如果需要的参数多，可以考虑从封装类中获取属性，如上
         如果需要的参数少，可以考虑如下操作
     */
    @Delete("DELETE FROM blog.weibo WHERE id = #{id}")
    int deleteWeibo(int id);
}
