package com.sakai._05mvcboot02.pojo.dto;

public class UserDto {
    private Integer id;
    private String username;
    private String password;
    private String nickname;


    public UserDto() {
    }

    public UserDto(Integer id, String username, String password, String nickname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }

    /**
     * 获取
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
        return "UserDto{id = " + id + ", username = " + username + ", password = " + password + ", nickname = " + nickname + "}";
    }
}
