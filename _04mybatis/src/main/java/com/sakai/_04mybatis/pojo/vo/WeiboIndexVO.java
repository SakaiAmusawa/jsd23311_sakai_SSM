package com.sakai._04mybatis.pojo.vo;

public class WeiboIndexVO {
    private Long id;
    private String content;
    private String nickName;

    public WeiboIndexVO() {
    }

    public WeiboIndexVO(Long id, String content, String nickName) {
        this.id = id;
        this.content = content;
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
        return "WeiboIndexVO{id = " + id + ", content = " + content + ", nickName = " + nickName + "}";
    }
}
