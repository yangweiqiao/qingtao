package com.zhoumai.qingtao.model;


import java.io.Serializable;
import java.util.List;


/**
 * Created by ${张科} on 2016/5/10.
 * 拼团详情返回结果
 */
public class GroubDetail implements Serializable {
    private int groupId;
    private String proImage;
    private String proName;
    private String discount;
    private String proPrice;
    private int numLimit;

    private String totalCount;
    private String nowTime;
    private String endTime;
    private String levelNum;
    private String productText;
    private List<String> imageList;
    private int productId;
    private int status;
    private String count;
    private String code;
    private String singleGroupId;
    private List<Levels> levels;
    private String desc;

    public int getGroupId() {
        return groupId;
    }

    public GroubDetail setGroupId(int groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getProImage() {
        return proImage;
    }

    public GroubDetail setProImage(String proImage) {
        this.proImage = proImage;
        return this;
    }

    public String getProName() {
        return proName;
    }

    public GroubDetail setProName(String proName) {
        this.proName = proName;
        return this;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public int getNumLimit() {
        return numLimit;
    }

    public GroubDetail setNumLimit(int numLimit) {
        this.numLimit = numLimit;
        return this;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public GroubDetail setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    public String getLevelNum() {
        return levelNum;
    }

    public GroubDetail setLevelNum(String levelNum) {
        this.levelNum = levelNum;
        return this;
    }

    public String getProductText() {
        return productText;
    }

    public GroubDetail setProductText(String productText) {
        this.productText = productText;
        return this;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public GroubDetail setImageList(List<String> imageList) {
        this.imageList = imageList;
        return this;
    }

    public int getProductId() {
        return productId;
    }

    public GroubDetail setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public GroubDetail setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getCount() {
        return count;
    }

    public GroubDetail setCount(String count) {
        this.count = count;
        return this;
    }

    public String getCode() {
        return code;
    }

    public GroubDetail setCode(String code) {
        this.code = code;
        return this;
    }

    public String getSingleGroupId() {
        return singleGroupId;
    }

    public GroubDetail setSingleGroupId(String singleGroupId) {
        this.singleGroupId = singleGroupId;
        return this;
    }

    public List<Levels> getLevels() {
        return levels;
    }

    public GroubDetail setLevels(List<Levels> levels) {
        this.levels = levels;
        return this;
    }


    public String getNowTime() {
        return nowTime;
    }

    public GroubDetail setNowTime(String nowTime) {
        this.nowTime = nowTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public GroubDetail setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
