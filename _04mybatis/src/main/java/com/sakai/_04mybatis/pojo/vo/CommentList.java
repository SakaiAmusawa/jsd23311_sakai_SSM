package com.sakai._04mybatis.pojo.vo;

import java.util.Date;

public class CommentList {
    private Long id;
    private String content;
    private Date created;
    private String nickname;


    public CommentList() {
    }

    public CommentList(Long id, String content, Date created, String nickname) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.nickname = nickname;
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
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置
     *
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取
     *
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置
     *
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String toString() {
        return "CommentList{id = " + id + ", content = " + content + ", created = " + created + ", nickname = " + nickname + "}" + "\n";
    }
}
