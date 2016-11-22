package com.zhoumai.qingtao.model;

/**
 * Created by 刘涛 on 2016/8/18.
 */
public class IndexSpecialSale {

    /**
     * ct : 1471489595505
     * ut : 1471489595505
     * id : 2
     * sellerId : 31
     * sellerName : 傅名锋
     * sellerUserName : fumf1
     * brandId : 59
     * brandName : 韩都衣舍
     * brandImage : http://qingtao-img.oss-cn-hangzhou.aliyuncs.com/qingtao/2016/8/73d40aa46d2e8f099de2016b9f761a55edf48595.jpg
     * orderBy : 1
     * image : http://qingtao-img.oss-cn-hangzhou.aliyuncs.com/qingtao/2016/8/fa194d7e2b4345ff678b3a11576a81d567812822.jpg
     * isDeleted : 0
     * title : 测试
     * endTime : 1471622399000
     * end : null
     * leftDays : 2
     */

    private long ct;
    private long ut;
    private long id;
    private long sellerId;
    private String sellerName;
    private String sellerUserName;
    private long brandId;
    private String brandName;
    private String brandImage;
    private int orderBy;
    private String image;
    private int isDeleted;
    private String title;
    private long endTime;
    private String end;
    private int leftDays;

    public long getCt() {
        return ct;
    }

    public void setCt(long ct) {
        this.ct = ct;
    }

    public long getUt() {
        return ut;
    }

    public void setUt(long ut) {
        this.ut = ut;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerUserName() {
        return sellerUserName;
    }

    public void setSellerUserName(String sellerUserName) {
        this.sellerUserName = sellerUserName;
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }


    public int getLeftDays() {
        return leftDays;
    }

    public void setLeftDays(int leftDays) {
        this.leftDays = leftDays;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
