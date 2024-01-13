package com.sakai.egmybatis2.pojo.entity;

public class Customers {
    private String custId;
    private String custTel;
    private String custName;
    private String address;

    public Customers() {
    }

    public Customers(String custId, String custTel, String custName, String address) {
        this.custId = custId;
        this.custTel = custTel;
        this.custName = custName;
        this.address = address;
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
     * @return custTel
     */
    public String getCustTel() {
        return custTel;
    }

    /**
     * 设置
     * @param custTel
     */
    public void setCustTel(String custTel) {
        this.custTel = custTel;
    }

    /**
     * 获取
     * @return custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置
     * @param custName
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Customers{custId = " + custId + ", custTel = " + custTel + ", custName = " + custName + ", address = " + address + "}";
    }
}
