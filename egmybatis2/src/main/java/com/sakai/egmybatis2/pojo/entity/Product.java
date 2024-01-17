package com.sakai.egmybatis2.pojo.entity;

public class Product {
    private Long id;
    private String title;
    private Double price;
    private Integer stock;


    public Product() {
    }

    public Product(Long id, String title, Double price, Integer stock) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.stock = stock;
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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     *
     * @param title
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
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置
     *
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Product{id = " + id + ", title = " + title + ", price = " + price + ", stock = " + stock + "}";
    }
}
