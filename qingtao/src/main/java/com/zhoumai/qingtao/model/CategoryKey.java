package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * 规格
 * Created by ${张科} on 2016/4/7.
 */
public class CategoryKey {
    private String id;//规格ID
    private String createTime;
    private String updateTime;
    private String creator;
    private String updater;
    private String categoryId;
    private String categoryKeyId;
    private String categoryKey;//规格名字
    private String categoryKeyValue;//规格值
    private String categoryKeyImg;
    private int isDeleted;
    private List<CategoryKey> list;

    private boolean isSelect;//是否被选中

    public String getId() {
        return id;
    }

    public CategoryKey setId(String id) {
        this.id = id;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public CategoryKey setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public CategoryKey setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getCreator() {
        return creator;
    }

    public CategoryKey setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public String getUpdater() {
        return updater;
    }

    public CategoryKey setUpdater(String updater) {
        this.updater = updater;
        return this;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public CategoryKey setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryKey() {
        return categoryKey;
    }

    public CategoryKey setCategoryKey(String categoryKey) {
        this.categoryKey = categoryKey;
        return this;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public CategoryKey setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public List<CategoryKey> getList() {
        return list;
    }

    public CategoryKey setList(List<CategoryKey> list) {
        this.list = list;
        return this;
    }

    public String getCategoryKeyValue() {
        return categoryKeyValue;
    }

    public CategoryKey setCategoryKeyValue(String categoryKeyValue) {
        this.categoryKeyValue = categoryKeyValue;
        return this;
    }

    public String getCategoryKeyId() {
        return categoryKeyId;
    }

    public CategoryKey setCategoryKeyId(String categoryKeyId) {
        this.categoryKeyId = categoryKeyId;
        return this;
    }

    public String getCategoryKeyImg() {
        return categoryKeyImg;
    }

    public CategoryKey setCategoryKeyImg(String categoryKeyImg) {
        this.categoryKeyImg = categoryKeyImg;
        return this;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public CategoryKey setIsSelect(boolean isSelect) {
        this.isSelect = isSelect;
        return this;
    }

    @Override
    public String toString() {
        return "CategoryKey{" +
               "id='" + id + '\'' +
               ", createTime='" + createTime + '\'' +
               ", updateTime='" + updateTime + '\'' +
               ", creator='" + creator + '\'' +
               ", updater='" + updater + '\'' +
               ", categoryId='" + categoryId + '\'' +
               ", categoryKeyId='" + categoryKeyId + '\'' +
               ", categoryKey='" + categoryKey + '\'' +
               ", categoryKeyValue='" + categoryKeyValue + '\'' +
               ", categoryKeyImg='" + categoryKeyImg + '\'' +
               ", isDeleted=" + isDeleted +
               ", list=" + list +
               ", isSelect=" + isSelect +
               '}';
    }
}
