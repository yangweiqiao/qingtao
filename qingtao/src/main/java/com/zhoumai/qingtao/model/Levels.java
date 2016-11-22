package com.zhoumai.qingtao.model;

import java.io.Serializable;

/**
 * Created by ${张科} on 2016/5/10.
 * 拼团 详情下的数据
 */
public class Levels implements Serializable {
    private int id;
    private String createTime;
    private String updateTime;
    private String creator;
    private String updater;
    private String isDeleted;
    private int groubId;
    private int num;
    private String discount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getGroubId() {
        return groubId;
    }

    public void setGroubId(int groubId) {
        this.groubId = groubId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
