package com.qphone.pojo;

import java.math.BigDecimal;

public class Orders {
    private BigDecimal oId;

    private BigDecimal uId;

    private BigDecimal orderid;

    private BigDecimal allprice;

    private String address;

    private String phone;

    public BigDecimal getoId() {
        return oId;
    }

    public void setoId(BigDecimal oId) {
        this.oId = oId;
    }

    public BigDecimal getuId() {
        return uId;
    }

    public void setuId(BigDecimal uId) {
        this.uId = uId;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getAllprice() {
        return allprice;
    }

    public void setAllprice(BigDecimal allprice) {
        this.allprice = allprice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}