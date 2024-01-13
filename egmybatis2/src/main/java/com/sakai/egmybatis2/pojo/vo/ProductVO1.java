package com.sakai.egmybatis2.pojo.vo;

public class ProductVO1 {
    private String title;
    private Double price;

    public ProductVO1() {
    }

    public ProductVO1(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "ProductVO1{title = " + title + ", price = " + price + "}";
    }
}
