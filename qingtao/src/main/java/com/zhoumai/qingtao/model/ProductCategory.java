package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by ${张科} on 2016/4/5.
 * 分类
 */
public class ProductCategory {
    private int id;
    private Long parentId;  //父分类id
    private String name;  //分类
    private String desc;  //补充说明
    private Integer level;  //分类等级
    private Integer sort;  //分类排序
    private String fullIdPath;  //分类全路径
    private Integer isBottom;  //底部
    private String image;  //图片
    private String bigImg;  //图片
    private String logo1;
    private String logo2;
    private List<ProductBrand> brands;
    private List<ProductCategory> children;

    public Long getParentId() {
        return parentId;
    }

    public ProductCategory setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductCategory setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ProductCategory setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public ProductCategory setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public ProductCategory setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String getFullIdPath() {
        return fullIdPath;
    }

    public ProductCategory setFullIdPath(String fullIdPath) {
        this.fullIdPath = fullIdPath;
        return this;
    }

    public Integer getIsBottom() {
        return isBottom;
    }

    public ProductCategory setIsBottom(Integer isBottom) {
        this.isBottom = isBottom;
        return this;
    }

    public String getImage() {
        return image;
    }

    public ProductCategory setImage(String image) {
        this.image = image;
        return this;
    }

    public String getBigImg() {
        return bigImg;
    }

    public ProductCategory setBigImg(String bigImg) {
        this.bigImg = bigImg;
        return this;
    }

    public String getLogo1() {
        return logo1;
    }

    public ProductCategory setLogo1(String logo1) {
        this.logo1 = logo1;
        return this;
    }

    public String getLogo2() {
        return logo2;
    }

    public ProductCategory setLogo2(String logo2) {
        this.logo2 = logo2;
        return this;
    }


    public List<ProductBrand> getBrands() {
        return brands;
    }

    public ProductCategory setBrands(List<ProductBrand> brands) {
        this.brands = brands;
        return this;
    }

    public List<ProductCategory> getChildren() {
        return children;
    }

    public ProductCategory setChildren(List<ProductCategory> children) {
        this.children = children;
        return this;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
               "parentId=" + parentId +
               ", name='" + name + '\'' +
               ", desc='" + desc + '\'' +
               ", level=" + level +
               ", sort=" + sort +
               ", fullIdPath='" + fullIdPath + '\'' +
               ", isBottom=" + isBottom +
               ", image='" + image + '\'' +
               ", bigImg='" + bigImg + '\'' +
               ", logo1='" + logo1 + '\'' +
               ", logo2='" + logo2 + '\'' +
               ", brands=" + brands +
               ", children=" + children +
               '}';
    }

    public int getId() {
        return id;
    }

    public ProductCategory setId(int id) {
        this.id = id;
        return this;
    }
}
