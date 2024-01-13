package com.sakai.egmybatis2.pojo.vo;

public class CustomersVO3 {
    private String CustName;
    private String orderId;
    private Double amt;
    private String status;

    public CustomersVO3() {
    }

    public CustomersVO3(String CustName, String orderId, Double amt, String status) {
        this.CustName = CustName;
        this.orderId = orderId;
        this.amt = amt;
        this.status = status;
    }

    /**
     * 获取
     *
     * @return CustName
     */
    public String getCustName() {
        return CustName;
    }

    /**
     * 设置
     *
     * @param CustName
     */
    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    /**
     * 获取
     *
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取
     *
     * @return amt
     */
    public Double getAmt() {
        return amt;
    }

    /**
     * 设置
     *
     * @param amt
     */
    public void setAmt(Double amt) {
        this.amt = amt;
    }

    /**
     * 获取
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "CustomersVO3{CustName = " + CustName + ", orderId = " + orderId + ", amt = " + amt + ", status = " + status + "}";
    }
}
