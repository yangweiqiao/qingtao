package com.zhoumai.qingtao.model;

import java.io.Serializable;

/**
 * Created by ${张科} on 2016/4/6.
 */
public class Info  implements Serializable {

    private String logo;
    private String name;
    private int fansNum;
    private int followNum;
    private double couponNum;
    private double money;

    public String getLogo() {
        return logo;
    }

    public Info setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getName() {
        return name;
    }

    public Info setName(String name) {
        this.name = name;
        return this;
    }

    public int getFansNum() {
        return fansNum;
    }

    public Info setFansNum(int fansNum) {
        this.fansNum = fansNum;
        return this;
    }

    public int getFollowNum() {
        return followNum;
    }

    public Info setFollowNum(int followNum) {
        this.followNum = followNum;
        return this;
    }

    public double getCouponNum() {
        return couponNum;
    }

    public Info setCouponNum(double couponNum) {
        this.couponNum = couponNum;
        return this;
    }

    public double getMoney() {
        return money;
    }

    public Info setMoney(double money) {
        this.money = money;
        return this;
    }
}
