package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/5/17.
 */
public class PeriodResult {

    /**
     * productId : 183
     * image : http://image.qingtaoapp.com/2016/4/2574d2b2-5518-499b-bed4-ed48e9605f4c.png
     * proName : 迪卡侬
     * discountPrice : 0.01
     * price : 1.00
     * leftCount : 10
     * totalCount : 10
     * status : 1
     */

    private Long productId;
    private String image;
    private String proName;
    private String discountPrice;
    private String price;
    private int leftCount;
    private int totalCount;
    private int status;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getLeftCount() {
        return leftCount;
    }

    public void setLeftCount(int leftCount) {
        this.leftCount = leftCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getProductId() {
        return productId;
    }

    public PeriodResult setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
}
