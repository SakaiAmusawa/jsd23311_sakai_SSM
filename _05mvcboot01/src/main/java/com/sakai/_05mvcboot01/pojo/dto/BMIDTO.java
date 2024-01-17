package com.sakai._05mvcboot01.pojo.dto;

public class BMIDTO {
    private Double weight;
    private Double height;


    public BMIDTO() {
    }

    public BMIDTO(Double weight, Double height) {
        this.weight = weight;
        this.height = height;
    }

    /**
     * 获取
     *
     * @return weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 设置
     *
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 获取
     *
     * @return height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    public String toString() {
        return "BMIDTO{weight = " + weight + ", height = " + height + "}";
    }
}
