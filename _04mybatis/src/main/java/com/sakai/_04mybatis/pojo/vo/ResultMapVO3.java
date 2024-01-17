package com.sakai._04mybatis.pojo.vo;

import com.sakai._04mybatis.pojo.entity.Comment;

import java.util.List;

public class ResultMapVO3 {
    private Long id;
    private String content;
    private List<Comment> commentList;


    public ResultMapVO3() {
    }

    public ResultMapVO3(Long id, String content, List<Comment> commentList) {
        this.id = id;
        this.content = content;
        this.commentList = commentList;
    }

    /**
     * 获取
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取
     *
     * @return commentList
     */
    public List<Comment> getCommentList() {
        return commentList;
    }

    /**
     * 设置
     *
     * @param commentList
     */
    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public String toString() {
        return "ResultMapVO3{id = " + id + ", content = " + content + ", commentList = " + commentList + "}";
    }
}
