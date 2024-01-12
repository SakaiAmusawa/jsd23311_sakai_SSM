package com.sakai._04mybatis.pojo.entity;

import java.util.Date;

public class Comment {
    private Long id;
    private String content;
    private Date created;
    private Long userId;
    private Long weiboId;


    public Comment() {
    }

    public Comment(Long id, String content, Date created, Long userId, Long weiboId) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.userId = userId;
        this.weiboId = weiboId;
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
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * @return weiboId
     */
    public Long getWeiboId() {
        return weiboId;
    }

    /**
     * 设置
     * @param weiboId
     */
    public void setWeiboId(Long weiboId) {
        this.weiboId = weiboId;
    }

    public String toString() {
        return "Comment{id = " + id + ", content = " + content + ", created = " + created + ", userId = " + userId + ", weiboId = " + weiboId + "}";
    }
}
