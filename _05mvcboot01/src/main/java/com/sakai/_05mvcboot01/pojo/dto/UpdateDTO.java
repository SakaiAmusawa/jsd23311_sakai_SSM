package com.sakai._05mvcboot01.pojo.dto;

public class UpdateDTO {
    private String title;
    private Double price;
    private Integer number;


    public UpdateDTO() {
    }

    public UpdateDTO(String title, Double price, Integer number) {
        this.title = title;
        this.price = price;
        this.number = number;
    }

    /**
     * 获取
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     *
     * @param title 商品的名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     *
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price 商品的价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置
     *
     * @param number 商品的数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String toString() {
        return "UpdateDTO{title = " + title + ", price = " + price + ", number = " + number + "}";
    }
}
