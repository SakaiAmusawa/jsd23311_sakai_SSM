package com.sakai._04mybatis.pojo.vo;

import java.util.Date;

public class WeiboDetailVo {
    private Long id;
    private String content;
    private Date created;
    private String nickName;


    public WeiboDetailVo() {
    }

    public WeiboDetailVo(Long id, String content, Date created, String nickName) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.nickName = nickName;
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
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String toString() {
        return "WeiboDetailVo{id = " + id + ", content = " + content + ", created = " + created + ", nickName = " + nickName + "}";
    }
}
