package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by 刘涛 on 2016/5/31.
 */
public class Order {

    /**
     * totalNum : 2
     * totalFee : 0.03
     * createTime : 2016-05-31 19:36:38
     * now : 2016-05-31 19:55:00
     * totalNo : 14646945982857149
     * orders : [{"id":38,"createTime":"2016-05-31 19:36:38","updateTime":"2016-05-31 19:36:38","creator":null,"updater":null,"isDeleted":0,"supplierId":2,"supplierName":null,"agencyId":null,"shopId":null,"shopUserId":0,"orderTallNo":"14646945982857149","orderNo":"14646945982857149","memberId":2,"userName":null,"status":0,"payType":1,"payInfo":null,"finishedTime":null,"totalFee":0.03,"totalNum":2,"fee":0.03,"commission":11,"couponId":null,"couponFee":0,"fullCutId":null,"fullCutFee":0,"expressFee":0,"expressAddFee":0,"mobile":"18955554443","name":"test2","email":null,"payTime":null,"cancelTime":null,"cancelReason":null,"payCode":null,"express":null,"expressNo":null,"sendTime":null,"sendFrom":null,"receiveTime":null,"returnReason":null,"address":"北京省北京市宣武区ndkdk","image":null,"year":null,"orderType":1,"joinInfo":null,"groupStatus":null,"orderItems":[{"id":35,"createTime":"2016-05-31 19:36:38","updateTime":"2016-05-31 19:36:38","creator":null,"updater":null,"isDeleted":null,"orderId":38,"cartItemId":247,"itemNo":null,"productId":183,"productDetailId":8065,"productSpec":"a","productName":"迪卡侬","productImg":"http://qingtao-img.oss-cn-hangzhou.aliyuncs.com/qingtao/2016/5/57455faf622050a9928ba5c794c927d1b16b4483.png","num":1,"price":0.02,"totalFee":0.02,"fee":0.02,"couponId":null,"couponFee":null,"memberId":2,"elements":null,"status":null,"commentStatus":0,"objId":0,"obj2Id":0},{"id":36,"createTime":"2016-05-31 19:36:38","updateTime":"2016-05-31 19:36:38","creator":null,"updater":null,"isDeleted":null,"orderId":38,"cartItemId":248,"itemNo":null,"productId":188,"productDetailId":8078,"productSpec":"盒","productName":"婴儿宝宝面条","productImg":"http://qingtao-img.oss-cn-hangzhou.aliyuncs.com/qingtao/2016/5/4fabed1d82812ac6c95993783130d2df775503ab.png","num":1,"price":0.01,"totalFee":0.01,"fee":0.01,"couponId":null,"couponFee":null,"memberId":2,"elements":null,"status":null,"commentStatus":0,"objId":0,"obj2Id":0}]}]
     * status : 0
     */

    private int totalNum;
    private double totalFee;
    private String createTime;
    private String now;
    private String totalNo;
    private int status;
    private List<OrderList> orders;

    public List<OrderList> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderList> orders) {
        this.orders = orders;
    }



    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public String getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(String totalNo) {
        this.totalNo = totalNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
