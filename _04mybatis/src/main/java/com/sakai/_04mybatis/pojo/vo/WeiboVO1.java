package com.sakai._04mybatis.pojo.vo;

import java.util.Date;

public class WeiboVO1 {
    private String content;
    private Date created;


    public WeiboVO1() {
    }

    public WeiboVO1(String content, Date created) {
        this.content = content;
        this.created = created;
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
     * @param content 微博的内容
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

    public String toString() {
        return "WeiboVO1{content = " + content + ", created = " + created + "}";
    }
}
