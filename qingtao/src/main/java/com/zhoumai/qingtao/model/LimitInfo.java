package com.zhoumai.qingtao.model;

import java.math.BigDecimal;

/**
 * Created by 刘涛 on 2016/8/10.
 *
 * 限时购
 */

public class LimitInfo {


    /**
     * endTime : 2016-08-10 16:00:00
     * soldCount : 0
     * totalCount : 999
     * price : 0.01
     */

    private String endTime;
    private int soldCount;
    private int totalCount;
    private BigDecimal price;
    private String nowTime;
    private Long leftBuyNum;

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(int soldCount) {
        this.soldCount = soldCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }

    public Long getLeftBuyNum() {
        return leftBuyNum;
    }

    public void setLeftBuyNum(Long leftBuyNum) {
        this.leftBuyNum = leftBuyNum;
    }
}
