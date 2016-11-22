package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/5/9.
 */
public class Groub {
    private int groupId;
    private String proImage;
    private String proName;
    private String desc;

    private Float discount;
    private double proPrice;
    private int numLimit;
    private  int totalCount;

    public int getGroupId() {
        return groupId;
    }

    public Groub setGroupId(int groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getProImage() {
        return proImage;
    }

    public Groub setProImage(String proImage) {
        this.proImage = proImage;
        return this;
    }

    public String getProName() {
        return proName;
    }

    public Groub setProName(String proName) {
        this.proName = proName;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Groub setDesc(String desc) {
        this.desc = desc;
        return this;
    }



    public double getProPrice() {
        return proPrice;
    }

    public Groub setProPrice(double proPrice) {
        this.proPrice = proPrice;
        return this;
    }

    public int getNumLimit() {
        return numLimit;
    }

    public Groub setNumLimit(int numLimit) {
        this.numLimit = numLimit;
        return this;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public Groub setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }
}
