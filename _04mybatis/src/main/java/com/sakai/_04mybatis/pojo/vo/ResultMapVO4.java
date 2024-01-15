package com.sakai._04mybatis.pojo.vo;

import java.util.List;

public class ResultMapVO4 {
    private Long id;
    private String content;
    private List<CommentListVO> commentListVOS;

    public ResultMapVO4() {
    }

    public ResultMapVO4(Long id, String content, List<CommentListVO> commentListVOS) {
        this.id = id;
        this.content = content;
        this.commentListVOS = commentListVOS;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取
     * @return commentListVOS
     */
    public List<CommentListVO> getCommentListVOS() {
        return commentListVOS;
    }

    /**
     * 设置
     * @param commentListVOS
     */
    public void setCommentListVOS(List<CommentListVO> commentListVOS) {
        this.commentListVOS = commentListVOS;
    }

    public String toString() {
        return "ResultMapVO4{id = " + id + ", content = " + content + ", commentListVOS = " + commentListVOS + "}";
    }
}
