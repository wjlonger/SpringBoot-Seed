package com.coder.springbootdomecollection.model;

public class SysUserSearch extends SysUser{

    private String orderBy;

    private String orderSequnce;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderSequnce() {
        return orderSequnce;
    }

    public void setOrderSequnce(String orderSequnce) {
        this.orderSequnce = orderSequnce;
    }
}