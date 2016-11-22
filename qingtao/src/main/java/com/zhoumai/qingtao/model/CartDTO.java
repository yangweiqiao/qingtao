package com.zhoumai.qingtao.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ${张科} on 2016/4/7.
 */
public class CartDTO {

    private List<CartItem> list;  //产品详情
    private BigDecimal totalFee;     //总金额
    //private Discount discount;  //优惠
    //private Discount discountNex;  //下一个满减优惠
    private String shopName;
    private String date;

    public List<CartItem> getList() {
        return list;
    }

    public CartDTO setList(List<CartItem> list) {
        this.list = list;
        return this;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public CartDTO setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    public String getShopName() {
        return shopName;
    }

    public CartDTO setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public String getDate() {
        return date;
    }

    public CartDTO setDate(String date) {
        this.date = date;
        return this;
    }
}
