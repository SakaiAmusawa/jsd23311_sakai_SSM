package com.sakai.egmvc1.pojo;

public class UserDTO {
    private String username;
    private String password;
    private String nickname;

    public UserDTO() {
    }

    public UserDTO(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
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
        return "UserDTO{username = " + username + ", password = " + password + ", nickname = " + nickname + "}";
    }
}
