package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by 刘涛 on 2016/8/26.
 */
public class SpecValue {


    /**
     * ct : 1472090062150
     * ut : 1472090062150
     * id : 18983
     * productId : 2700
     * detailIds : [3671]
     * price : 19.2
     * stock : 994
     * isDeleted : 0
     */

    private long ct;
    private long ut;
    private String id;
    private int productId;
    private String price;
    private int stock;
    private int isDeleted;
    private List<String> detailIds;

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



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }



    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getDetailIds() {
        return detailIds;
    }

    public void setDetailIds(List<String> detailIds) {
        this.detailIds = detailIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
