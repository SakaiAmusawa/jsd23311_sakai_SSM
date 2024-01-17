package com.sakai._04mybatis.pojo.vo;

import com.sakai._04mybatis.pojo.entity.Weibo;

import java.util.List;

public class SelectWeiboInfoByUserId {
    private Long id;
    private String nickname;

    private List<Weibo> weiboList;


    public SelectWeiboInfoByUserId() {
    }

    public SelectWeiboInfoByUserId(Long id, String nickname, List<Weibo> weiboList) {
        this.id = id;
        this.nickname = nickname;
        this.weiboList = weiboList;
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

    /**
     * 获取
     *
     * @return weiboList
     */
    public List<Weibo> getWeiboList() {
        return weiboList;
    }

    /**
     * 设置
     *
     * @param weiboList
     */
    public void setWeiboList(List<Weibo> weiboList) {
        this.weiboList = weiboList;
    }

    public String toString() {
        return "SelectWeiboInfoByUserId{id = " + id + ", nickname = " + nickname + ", weiboList = " + weiboList + "}";
    }
}
