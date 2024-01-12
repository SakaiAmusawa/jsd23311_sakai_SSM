package com.sakai._04mybatis.pojo.entity;

import java.util.Date;

public class User {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private Date created;

    public User() {
    }

    public User(Long id, String username, String password, String nickname, Date created) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", created=" + created +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
