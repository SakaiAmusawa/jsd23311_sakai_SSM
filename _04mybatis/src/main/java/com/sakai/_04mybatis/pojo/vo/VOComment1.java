package com.sakai._04mybatis.pojo.vo;

public class VOComment1 {
    private String content;
    private Long userId;
    private Long weiboId;

    public VOComment1() {
    }

    public VOComment1(String content, Long userId, Long weiboId) {
        this.content = content;
        this.userId = userId;
        this.weiboId = weiboId;
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
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置
     *
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取
     *
     * @return weiboId
     */
    public Long getWeiboId() {
        return weiboId;
    }

    /**
     * 设置
     *
     * @param weiboId
     */
    public void setWeiboId(Long weiboId) {
        this.weiboId = weiboId;
    }

    public String toString() {
        return "VOComment1{content = " + content + ", userId = " + userId + ", weiboId = " + weiboId + "}";
    }
}
