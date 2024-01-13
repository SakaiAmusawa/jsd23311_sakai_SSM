package com.sakai._04mybatis.pojo.entity;

import java.util.Date;

public class Weibo {
    private Long id;
    private String content;
    private Date created;
    private Long userId;


    public Weibo() {
    }

    public Weibo(Long id, String content, Date created, Long user_id) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.userId = user_id;
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
     * @param id 微博ID
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
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取
     *
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String toString() {
        return "WeiboMapper{id = " + id + ", content = " + content + ", created = " + created + ", user_id = " + userId + "\n}";
    }
}
