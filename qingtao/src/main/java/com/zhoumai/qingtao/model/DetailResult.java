package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by ${乔帮主} on 2016/11/22.
 * 商品详情
 *
 */
public class DetailResult {

    private Product product;
    private String commentNum;
    private List<ProductDetail> productDetails;

    //private List<CategoryKey> categoryKeys;

    private int collect;   //收藏标记  0：未收藏

    private BrandInfo brandInfo;

    private LimitInfo limitInfo;

    private List<Spec> specs;

    private List<SpecValue> specValues;

    private Shop shop;

    public Product getProduct() {
        return product;
    }

    public DetailResult setProduct(Product product) {
        this.product = product;
        return this;
    }

    public List<ProductDetail> getProductDetails() {
        return productDetails;
    }

    public DetailResult setProductDetails(List<ProductDetail> productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    public int getCollect() {
        return collect;
    }

    public DetailResult setCollect(int collect) {
        this.collect = collect;
        return this;
    }

    public BrandInfo getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(BrandInfo brandInfo) {
        this.brandInfo = brandInfo;
    }

    public LimitInfo getLimitInfo() {
        return limitInfo;
    }

    public void setLimitInfo(LimitInfo limitInfo) {
        this.limitInfo = limitInfo;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Spec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = specs;
    }

    public List<SpecValue> getSpecValues() {
        return specValues;
    }

    public void setSpecValues(List<SpecValue> specValues) {
        this.specValues = specValues;
    }
}
