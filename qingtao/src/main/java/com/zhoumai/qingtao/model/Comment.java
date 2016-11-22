package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by ${张科} on 2016/5/6.
 * 评论
 */
public class Comment {
    private Long productId;  //产品id

    private Integer level;  //分数

    private String content;  //内容

    private Integer status;   //

    private String images;  //图片

    private String remark;

    private Long memberId;  //评论人

    private Integer isDeleted=0;
    public String updateTime;
    public String createTime;

    private String nickName; //会员昵称

    private String logo; //会员头像

    private String productName; //产品昵称

    private List<String> imageList;

    public Long getProductId() {
        return productId;
    }

    public Comment setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Comment setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Comment setContent(String content) {
        this.content = content;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Comment setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getImages() {
        return images;
    }

    public Comment setImages(String images) {
        this.images = images;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public Comment setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Long getMemberId() {
        return memberId;
    }

    public Comment setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public Comment setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public Comment setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public Comment setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public Comment setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public Comment setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Comment setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public Comment setImageList(List<String> imageList) {
        this.imageList = imageList;
        return this;
    }
}
