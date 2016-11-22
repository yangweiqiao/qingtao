package com.zhoumai.qingtao.model;

import java.io.Serializable;

/**
 * Created by 刘涛 on 2016/8/4.
 */
public class BrandInfo implements Serializable {

    /**
     * logo : http://qingtao-img.oss-cn-hangzhou.aliyuncs.com/qingtao/2016/8/2e0d6f2d2cccef81a8f7322afb4f0a1d4b0e1d06.jpg
     * bg : null
     * name : 喜贝雅
     * isCollect : 0
     * desc : null
     * brandId : 2
     * buyNum : 0
     * proNum : 0
     * collectNum : 0
     * commentLevel : 5.0
     * packageLevel : 5.0
     * deliverLevel : 5.0
     */

    private String logo;
    private String bg;
    private String name;
    private int isCollect;
    private String desc;
    private int brandId;
    private String buyNum;
    private String proNum;
    private String collectNum;
    private String commentLevel;
    private String packageLevel;
    private String deliverLevel;
    private String newProNum;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(int isCollect) {
        this.isCollect = isCollect;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(String buyNum) {
        this.buyNum = buyNum;
    }

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }

    public String getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(String collectNum) {
        this.collectNum = collectNum;
    }

    public String getCommentLevel() {
        return commentLevel;
    }

    public void setCommentLevel(String commentLevel) {
        this.commentLevel = commentLevel;
    }

    public String getPackageLevel() {
        return packageLevel;
    }

    public void setPackageLevel(String packageLevel) {
        this.packageLevel = packageLevel;
    }

    public String getDeliverLevel() {
        return deliverLevel;
    }

    public void setDeliverLevel(String deliverLevel) {
        this.deliverLevel = deliverLevel;
    }

    public String getNewProNum() {
        return newProNum;
    }

    public void setNewProNum(String newProNum) {
        this.newProNum = newProNum;
    }
}
