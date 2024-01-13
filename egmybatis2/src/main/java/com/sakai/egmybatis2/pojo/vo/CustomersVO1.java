package com.sakai.egmybatis2.pojo.vo;

public class CustomersVO1 {
    private String name;
    private String custTel;

    public CustomersVO1() {
    }

    public CustomersVO1(String name, String custTel) {
        this.name = name;
        this.custTel = custTel;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    public String toString() {
        return "CustomersVO1{name = " + name + ", custTel = " + custTel + "}";
    }
}
