package com.sakai._04mybatis.pojo.vo;

public class VOComment2 {
    private String content;
    private Long userId;

    public VOComment2() {
    }

    public VOComment2(String content, Long userId) {
        this.content = content;
        this.userId = userId;
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

    public String toString() {
        return "VOComment2{content = " + content + ", userId = " + userId + "}";
    }
}
