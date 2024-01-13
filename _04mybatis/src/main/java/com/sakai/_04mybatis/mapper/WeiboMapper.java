package com.sakai._04mybatis.mapper;

import com.sakai._04mybatis.pojo.entity.Weibo;
import com.sakai._04mybatis.pojo.vo.VOeg7;
import com.sakai._04mybatis.pojo.vo.WeiboVO1;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WeiboMapper {
    //@Insert("INSERT INTO blog.weibo(content, created, user_id) VALUES (#{content},#{created},#{userId})")
    int insertWeibo(Weibo weibo);

    /*
    根据微博的ID删除指定的微博信息
    补充：如果需要的参数多，可以考虑从封装类中获取属性，如上
         如果需要的参数少，可以考虑如下操作
     */
   // @Delete("DELETE FROM blog.weibo WHERE id = #{id}")
    int deleteWeibo(int id);

    /**
     * @param weibo 传入Weibo对象，这样可以在使用其中多个属性时简化步骤
     * @return 1为执行成功
     */
    //@Update("UPDATE blog.weibo SET content = #{content},created = #{created} WHERE id = #{id}")
    int updateWeibo(Weibo weibo);

    /**
     * 查：单条查询-全列查询
     * 根据微博ID查询该条微博的信息[全列]
     */

    //                                 注意使用user_id起一个别名，别名就是weibo Bean中对应的属性名
//    @Select("SELECT id,content,created,user_id userId FROM blog.weibo WHERE id = #{id}")
    Weibo selectWeibo(int id);

//    @Select("SELECT id,content,created,user_id userId FROM blog.weibo")
    List<Weibo> selectAll();

//    @Select("SELECT content,created FROM blog.weibo WHERE id = #{id}")
    List<WeiboVO1> selectColumns(Long id);

//    @Select("SELECT id,content,created FROM blog.weibo WHERE user_id = #{userId}")
    List<VOeg7> selecteg7(Long userId);

}
