package com.sakai._05mvcboot01.pojo.dto;

public class BMIDTO {
    private Double kg;
    private Double high;

    public BMIDTO() {
    }

    public BMIDTO(Double kg, Double high) {
        this.kg = kg;
        this.high = high;
    }

    /**
     * 获取
     *
     * @return kg
     */
    public Double getKg() {
        return kg;
    }

    /**
     * 设置
     *
     * @param kg
     */
    public void setKg(Double kg) {
        this.kg = kg;
    }

    /**
     * 获取
     *
     * @return high
     */
    public Double getHigh() {
        return high;
    }

    /**
     * 设置
     *
     * @param high
     */
    public void setHigh(Double high) {
        this.high = high;
    }

    public String toString() {
        return "BMIDTO{kg = " + kg + ", high = " + high + "}";
    }
}
