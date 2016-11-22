package com.zhoumai.qingtao.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * @ClassName:${class}
 * @Description： 佣金
 * Created by ${mty} on 2016/4/18.
 * http://blog.csdn.net/yunyuliunian
 */
public class MyCommission implements Parcelable {

    /**
     * id : 41
     * createTime : null
     * updateTime : 2016-06-12 11:49:44
     * creator : null
     * updater : null
     * isDeleted : null
     * userId : 2
     * availableCapital : 1.12
     * unavailableCapital : 5.5
     * totalCapital : 59.17
     * version : 0
     * sevenCapital : 0.04
     * todayCapital : 0
     * orderNum : 0
     * couponNum : null
     * points : 3
     * commissions : [{"id":86,"createTime":"2016-05-04 16:33:18","updateTime":"2016-05-04 16:33:18","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.01,"money":2.8,"userId":2,"userType":2,"commInfo":null,"fromUserId":74,"fromUserName":null,"shopId":null,"orderId":394,"orderNo":null,"precent":70,"degree":-1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":0},{"id":95,"createTime":"2016-05-04 17:11:54","updateTime":"2016-05-04 17:11:54","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.01,"money":2,"userId":2,"userType":2,"commInfo":null,"fromUserId":79,"fromUserName":null,"shopId":null,"orderId":397,"orderNo":null,"precent":50,"degree":-1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":0},{"id":102,"createTime":"2016-05-04 17:29:24","updateTime":"2016-05-04 17:29:24","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.01,"money":1.2,"userId":2,"userType":2,"commInfo":null,"fromUserId":81,"fromUserName":null,"shopId":null,"orderId":398,"orderNo":null,"precent":30,"degree":-1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":0},{"id":110,"createTime":"2016-05-04 17:38:26","updateTime":"2016-05-04 17:38:26","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.01,"money":1,"userId":2,"userType":2,"commInfo":null,"fromUserId":82,"fromUserName":null,"shopId":null,"orderId":400,"orderNo":null,"precent":25,"degree":-1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":0},{"id":158,"createTime":"2016-05-06 10:53:36","updateTime":"2016-05-06 10:53:36","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.1,"money":0.02,"userId":2,"userType":2,"commInfo":null,"fromUserId":114,"fromUserName":null,"shopId":null,"orderId":449,"orderNo":null,"precent":20,"degree":1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":1},{"id":161,"createTime":"2016-05-06 11:03:42","updateTime":"2016-05-06 11:03:42","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.1,"money":0.02,"userId":2,"userType":2,"commInfo":null,"fromUserId":115,"fromUserName":null,"shopId":null,"orderId":450,"orderNo":null,"precent":20,"degree":1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":1},{"id":164,"createTime":"2016-05-06 11:10:17","updateTime":"2016-05-06 11:10:17","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.1,"money":0.02,"userId":2,"userType":2,"commInfo":null,"fromUserId":117,"fromUserName":null,"shopId":null,"orderId":451,"orderNo":null,"precent":20,"degree":1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":1},{"id":167,"createTime":"2016-05-06 11:16:45","updateTime":"2016-05-06 11:16:45","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.1,"money":0.02,"userId":2,"userType":2,"commInfo":null,"fromUserId":118,"fromUserName":null,"shopId":null,"orderId":452,"orderNo":null,"precent":20,"degree":1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":1},{"id":170,"createTime":"2016-05-06 11:42:08","updateTime":"2016-05-06 11:42:08","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.2,"money":0.04,"userId":2,"userType":2,"commInfo":null,"fromUserId":119,"fromUserName":null,"shopId":null,"orderId":453,"orderNo":null,"precent":20,"degree":1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":1},{"id":174,"createTime":"2016-05-06 11:42:08","updateTime":"2016-05-06 11:42:08","creator":null,"updater":null,"isDeleted":0,"objId":null,"objType":1,"points":0,"amount":0.2,"money":0.03,"userId":2,"userType":2,"commInfo":null,"fromUserId":119,"fromUserName":null,"shopId":null,"orderId":453,"orderNo":null,"precent":15,"degree":-1,"accountName":null,"accountCode":null,"isConfirm":0,"dealTime":null,"dealFlag":1}]
     */

    private int id;
    private String createTime;
    private String updateTime;
    private String creator;
    private String updater;
    private String isDeleted;
    private int userId;
    private double availableCapital;
    private double unavailableCapital;
    private double totalCapital;
    private int version;
    private double sevenCapital;
    private double todayCapital;
    private int orderNum;
    private int couponNum;
    private int points;



    private List<Commission> commissions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }





    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAvailableCapital() {
        return availableCapital;
    }

    public void setAvailableCapital(double availableCapital) {
        this.availableCapital = availableCapital;
    }

    public double getUnavailableCapital() {
        return unavailableCapital;
    }

    public void setUnavailableCapital(double unavailableCapital) {
        this.unavailableCapital = unavailableCapital;
    }

    public double getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(double totalCapital) {
        this.totalCapital = totalCapital;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public double getSevenCapital() {
        return sevenCapital;
    }

    public void setSevenCapital(double sevenCapital) {
        this.sevenCapital = sevenCapital;
    }


    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }



    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }



    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(int couponNum) {
        this.couponNum = couponNum;
    }
    public List<Commission> getCommissions() {
        return commissions;
    }

    public void setCommissions(List<Commission> commissions) {
        this.commissions = commissions;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.commissions);
    }

    public MyCommission() {
    }

    protected MyCommission(Parcel in) {
        this.commissions = in.createTypedArrayList(Commission.CREATOR);
    }

    public static final Parcelable.Creator<MyCommission> CREATOR = new Parcelable.Creator<MyCommission>() {
        @Override
        public MyCommission createFromParcel(Parcel source) {
            return new MyCommission(source);
        }

        @Override
        public MyCommission[] newArray(int size) {
            return new MyCommission[size];
        }
    };

    public double getTodayCapital() {
        return todayCapital;
    }

    public void setTodayCapital(double todayCapital) {
        this.todayCapital = todayCapital;
    }
}
