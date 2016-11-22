package com.zhoumai.qingtao.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @ClassName:${class}
 * @Description：我的佣金里的列表数据
 * Created by ${mty} on 2016/4/18.
 * http://blog.csdn.net/yunyuliunian
 */
public class Commission implements Parcelable {

    /**
     * id : 174
     * createTime : 2016-05-06 11:42:08
     * updateTime : 2016-05-06 11:42:08
     * creator : null
     * updater : null
     * isDeleted : 0
     * objId : null
     * objType : 1
     * points : 0
     * amount : 0.2
     * money : 0.03
     * userId : 2
     * userType : 2
     * commInfo : null
     * fromUserId : 119
     * fromUserName : null
     * shopId : null
     * orderId : 453
     * orderNo : null
     * precent : 15
     * degree : -1
     * accountName : null
     * accountCode : null
     * isConfirm : 0
     * dealTime : null
     * dealFlag : 1
     */

    private int id;
    private String createTime;
    private String updateTime;
    private String creator;
    private String updater;
    private int isDeleted;
    private int objId;
    private int objType;
    private int points;
    private double amount;
    private double money;
    private int userId;
    private int userType;
    private String commInfo;
    private int fromUserId;
    private String fromUserName;
    private String shopId;
    private int orderId;
    private String orderNo;
    private int precent;
    private int degree;
    private String accountName;
    private String accountCode;
    private int isConfirm;
    private String dealTime;
    private int dealFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setOrderNo(String orderNo){
        this.orderNo=orderNo;
    }
    public String getOrderNo(){
        return orderNo;
    }


    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }



    public int getObjType() {
        return objType;
    }

    public void setObjType(int objType) {
        this.objType = objType;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public int getObjId() {
        return objId;
    }

    public void setObjId(int objId) {
        this.objId = objId;
    }

    public String getCommInfo() {
        return commInfo;
    }

    public void setCommInfo(String commInfo) {
        this.commInfo = commInfo;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }



    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }




    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public int getPrecent() {
        return precent;
    }

    public void setPrecent(int precent) {
        this.precent = precent;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }





    public int getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(int isConfirm) {
        this.isConfirm = isConfirm;
    }



    public int getDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(int dealFlag) {
        this.dealFlag = dealFlag;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.createTime);
        dest.writeString(this.updateTime);
        dest.writeString(this.creator);
        dest.writeString(this.updater);
        dest.writeInt(this.isDeleted);
        dest.writeInt(this.objId);
        dest.writeInt(this.objType);
        dest.writeInt(this.points);
        dest.writeDouble(this.amount);
        dest.writeDouble(this.money);
        dest.writeInt(this.userId);
        dest.writeInt(this.userType);
        dest.writeString(this.commInfo);
        dest.writeInt(this.fromUserId);
        dest.writeString(this.fromUserName);
        dest.writeString(this.shopId);
        dest.writeInt(this.orderId);
        dest.writeString(this.orderNo);
        dest.writeInt(this.precent);
        dest.writeInt(this.degree);
        dest.writeString(this.accountName);
        dest.writeString(this.accountCode);
        dest.writeInt(this.isConfirm);
        dest.writeString(this.dealTime);
        dest.writeInt(this.dealFlag);
    }

    public Commission() {
    }

    protected Commission(Parcel in) {
        this.id = in.readInt();
        this.createTime = in.readString();
        this.updateTime = in.readString();
        this.creator = in.readString();
        this.updater = in.readString();
        this.isDeleted = in.readInt();
        this.objId = in.readInt();
        this.objType = in.readInt();
        this.points = in.readInt();
        this.amount = in.readDouble();
        this.money = in.readDouble();
        this.userId = in.readInt();
        this.userType = in.readInt();
        this.commInfo = in.readString();
        this.fromUserId = in.readInt();
        this.fromUserName = in.readString();
        this.shopId = in.readString();
        this.orderId = in.readInt();
        this.orderNo = in.readString();
        this.precent = in.readInt();
        this.degree = in.readInt();
        this.accountName = in.readString();
        this.accountCode = in.readString();
        this.isConfirm = in.readInt();
        this.dealTime = in.readString();
        this.dealFlag = in.readInt();
    }

    public static final Parcelable.Creator<Commission> CREATOR = new Parcelable.Creator<Commission>() {
        @Override
        public Commission createFromParcel(Parcel source) {
            return new Commission(source);
        }

        @Override
        public Commission[] newArray(int size) {
            return new Commission[size];
        }
    };
}
