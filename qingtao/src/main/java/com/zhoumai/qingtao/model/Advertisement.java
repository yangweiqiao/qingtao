package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/4/5.
 */
public class Advertisement {
    private Long adzoneId;//广告位id
    private String title;//广告标题
    private String image;//图片
    private String url;//点击后的跳转链接
    private Long sort;//排序
    private String content;//简介
    private Integer isDeleted = 0;

    public Long getAdzoneId() {
        return adzoneId;
    }

    public Advertisement setAdzoneId(Long adzoneId) {
        this.adzoneId = adzoneId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Advertisement setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Advertisement setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Advertisement setUrl(String url) {
        this.url = url;
        return this;
    }

    public Long getSort() {
        return sort;
    }

    public Advertisement setSort(Long sort) {
        this.sort = sort;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Advertisement setContent(String content) {
        this.content = content;
        return this;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public Advertisement setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
}
