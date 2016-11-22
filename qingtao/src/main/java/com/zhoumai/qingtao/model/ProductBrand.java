package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/4/5.
 * 品牌
 */
public class ProductBrand {
    private int id;            //品牌id
    private String brandName;  //品牌名
    private String brandImage; //品牌图片
    private String brandInfo;  //品牌说明
    private Integer isDeleted; //删除
    private Long catParentId;  //父分类，对应页面上的业务，查询方便点
    private Long catId;       //品牌所属的分类
    private String categoryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public ProductBrand setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public ProductBrand setBrandImage(String brandImage) {
        this.brandImage = brandImage;
        return this;
    }

    public String getBrandInfo() {
        return brandInfo;
    }

    public ProductBrand setBrandInfo(String brandInfo) {
        this.brandInfo = brandInfo;
        return this;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public ProductBrand setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Long getCatParentId() {
        return catParentId;
    }

    public ProductBrand setCatParentId(Long catParentId) {
        this.catParentId = catParentId;
        return this;
    }

    public Long getCatId() {
        return catId;
    }

    public ProductBrand setCatId(Long catId) {
        this.catId = catId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ProductBrand setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    @Override
    public String toString() {
        return "ProductBrand{" +
               "brandName='" + brandName + '\'' +
               ", brandImage='" + brandImage + '\'' +
               ", brandInfo='" + brandInfo + '\'' +
               ", isDeleted=" + isDeleted +
               ", catParentId=" + catParentId +
               ", catId=" + catId +
               ", categoryName='" + categoryName + '\'' +
               '}';
    }
}
