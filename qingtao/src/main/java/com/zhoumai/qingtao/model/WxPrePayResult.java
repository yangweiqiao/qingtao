package com.zhoumai.qingtao.model;

/**
 * Created by 刘涛 on 2016/6/7.
 */
public class WxPrePayResult {
    private String timeStamp;//时间戳
    private String nonceStr;//随机字符串
    private String paySign;//最终得到的签名
    private String prepayId;



    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }


    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }
}
