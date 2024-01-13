package com.sakai.egmybatis2.pojo.entity;

import java.util.Date;

public class Orders {
    private String orderId;
    private String custId;
    private Date orderDate;
    private String status;
    private Integer productNum;
    private Double amt;

    public Orders() {
    }

    public Orders(String orderId, String custId, Date orderDate, String status, Integer productNum, Double amt) {
        this.orderId = orderId;
        this.custId = custId;
        this.orderDate = orderDate;
        this.status = status;
        this.productNum = productNum;
        this.amt = amt;
    }

    /**
     * 获取
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取
     * @return custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置
     * @param custId
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * 获取
     * @return orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * 设置
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 获取
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取
     * @return productNum
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * 设置
     * @param productNum
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * 获取
     * @return amt
     */
    public Double getAmt() {
        return amt;
    }

    /**
     * 设置
     * @param amt
     */
    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public String toString() {
        return "Orders{orderId = " + orderId + ", custId = " + custId + ", orderDate = " + orderDate + ", status = " + status + ", productNum = " + productNum + ", amt = " + amt + "}";
    }
}
