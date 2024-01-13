package com.sakai.egmybatis1.pojo.vo;

public class ProductVoTitleStock {
    private String title;
    private Integer stock;

    public ProductVoTitleStock() {
    }

    public ProductVoTitleStock(String title, Integer stock) {
        this.title = title;
        this.stock = stock;
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
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String toString() {
        return "ProductVoTitleStock{title = " + title + ", stock = " + stock + "}";
    }
}
