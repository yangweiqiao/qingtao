package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/4/7.
 */
public class ProductDetail {
    private String id;
    private String createTime;
    private String updateTime;
    private String updater;
    private String productId;
    private String detailCodeId;
    private String value;
    private String price;
    private String img;
    private String stockSize;



    private boolean isSelect;//是否被选中

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public String getId() {
        return id;
    }

    public ProductDetail setId(String id) {
        this.id = id;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public ProductDetail setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public ProductDetail setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdater() {
        return updater;
    }

    public ProductDetail setUpdater(String updater) {
        this.updater = updater;
        return this;
    }

    public String getProductId() {
        return productId;
    }

    public ProductDetail setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public String getDetailCodeId() {
        return detailCodeId;
    }

    public ProductDetail setDetailCodeId(String detailCodeId) {
        this.detailCodeId = detailCodeId;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ProductDetail setValue(String value) {
        this.value = value;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public ProductDetail setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getImg() {
        return img;
    }

    public ProductDetail setImg(String img) {
        this.img = img;
        return this;
    }

    public String getStockSize() {
        return stockSize;
    }

    public ProductDetail setStockSize(String stockSize) {
        this.stockSize = stockSize;
        return this;
    }



    @Override
    public String toString() {
        return "ProductDetail{" +
               "id='" + id + '\'' +
               ", createTime='" + createTime + '\'' +
               ", updateTime='" + updateTime + '\'' +
               ", updater='" + updater + '\'' +
               ", productId='" + productId + '\'' +
               ", detailCodeId='" + detailCodeId + '\'' +
               ", value='" + value + '\'' +
               ", price='" + price + '\'' +
               ", img='" + img + '\'' +
               ", stockSize='" + stockSize + '\'' +
               '}';
    }
}
