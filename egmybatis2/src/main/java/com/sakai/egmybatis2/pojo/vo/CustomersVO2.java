package com.sakai.egmybatis2.pojo.vo;

public class CustomersVO2 {
    private String name;
    private String address;

    public CustomersVO2() {
    }

    public CustomersVO2(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "CustomersVO2{name = " + name + ", address = " + address + "}";
    }
}
