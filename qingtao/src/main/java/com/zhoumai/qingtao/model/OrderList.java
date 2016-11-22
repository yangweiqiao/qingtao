package com.zhoumai.qingtao.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName:${class}
 * @Description：订单列表 Created by ${mty} on 2016/4/19.
 * http://blog.csdn.net/yunyuliunian
 */
public class OrderList implements Parcelable {
    private static final long serialVersionUID = 404909382022698135L;
    public static final int ORDER_INIT = -1;  //订单初始化
    public static final int ORDER_CREATE = 0;  //0：未付款
    public static final int ORDER_PAY = 1;  //  1：已付款，待发货，可退款
    public static final int ORDER_SEND = 2;   //2：已发货，待收货，可退货
    public static final int ORDER_RECEIVE = 3;  //3：已收货，待评价
    public static final int ORDER_COMMENT = 4;  //4：订单完成，已经评价
    public static final int ORDER_CANCEL = 5;  //仅退款  ,申请中
    public static final int ORDER_REFUND = 6;  //退款退货  ,申请中
    public static final int ORDER_REFUND_ON = 7;  //退货发货中 供货商同意
    public static final int ORDER_REFUSE = 8;  //拒绝
    public static final int ORDER_END = 9;  //退货退款完成
    public static final int ORDER_CONSUME= 10;//已消费
    public static final int ORDER_REFUND_ON_2=11;//退货 用户已发货
    public static final int ORDER_REFUND_ON_3=12;// 退款/退货 转账中
    public static final int ORDER_REFUND_ON_4=13;// 退款/退货 转账失败


    private Long id;


    private Long supplierId;   //供应商id

    private Long agencyId;  //代理商id

    private Long shopId;   //店铺id  与shopUserId对应

    private Long shopUserId;  //代理商id

    private String orderTallNo;  // 总订单编号

    private String orderNo;  //订单编号

    private Long memberId;  //用户id
    private String userName;  //用户id


    //订单状态 0：未付款
    //1：已付款，待发货
    //2：已发货，待收货
    //3：已收货，待评价
    //4：订单完成，已经评价
    //5:退款，未收货
    //6：退款：已发货
    private Integer status;

    private Integer payType;  //支付方式1：支付宝，2：微信  3：银联

    private String payInfo;  //支付信息 支付流水号

    private String finishedTime;   //订单结束时间，没有后续操作

    private BigDecimal totalFee;  //产品总价格

    private BigDecimal fee;   //支付价格
    private BigDecimal commission; //总佣金

    private Long couponId;  //用户优惠券id
    private BigDecimal couponFee;  //优惠的费用
    private Long fullCutId;     //满减id
    private BigDecimal fullCutFee;  //满减费用

    private BigDecimal expressFee;   //邮费

    private BigDecimal expressAddFee;  //偏远地区物流补贴费用 没有填0

    private String mobile;  //收货手机

    private String name;  //收货姓名 ，orderType=2：账号

    private String email; //收货邮箱

    private String payTime;  //付款时间

    private String cancelTime;  //取消时间

    private String cancelReason;  //取消原因

    private String payCode;  //网银编码

    private String express;  //快递名称

    private String expressNo;  //快递单号

    private String sendTime;  //发货时间

    private String receiveTime;  //收货时间

    private String returnReason;  //退货原因

    private String address;  //收货地址

    private String image;   //退货图片

    private Integer year;   //购买年数,加盟订单中使用

    private Integer orderType;  //订单类型  1：产品订单   2：续费
    private String joinInfo;  //加盟订单信息
    private Integer isDeleted;

    List<OrderItem> orderItems;

    private String createTime; //创建时间
    private String updateTime; //修改时间
    private String creator; //创建者
    private String updater;//最后修改者

    private String supplierName;    //供货商的名字
    private String sendFrom;  //发货地

    private int totalNum;

    private String returnAddr;//退货地址
    private String returnName;//退货人
    private String returnMobi;//货电话
    private String returnMemo;//退货备注

    private String returnDenyReason;//拒绝原因、转账失败原因


    public String getSendFrom() {
        return sendFrom;
    }

    public void setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getShopUserId() {
        return shopUserId;
    }

    public void setShopUserId(Long shopUserId) {
        this.shopUserId = shopUserId;
    }

    public String getOrderTallNo() {
        return orderTallNo;
    }

    public void setOrderTallNo(String orderTallNo) {
        this.orderTallNo = orderTallNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }


    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public BigDecimal getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(BigDecimal couponFee) {
        this.couponFee = couponFee;
    }

    public Long getFullCutId() {
        return fullCutId;
    }

    public void setFullCutId(Long fullCutId) {
        this.fullCutId = fullCutId;
    }

    public BigDecimal getFullCutFee() {
        return fullCutFee;
    }

    public void setFullCutFee(BigDecimal fullCutFee) {
        this.fullCutFee = fullCutFee;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    public BigDecimal getExpressAddFee() {
        return expressAddFee;
    }

    public void setExpressAddFee(BigDecimal expressAddFee) {
        this.expressAddFee = expressAddFee;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }


    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getJoinInfo() {
        return joinInfo;
    }

    public void setJoinInfo(String joinInfo) {
        this.joinInfo = joinInfo;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeValue(this.supplierId);
        dest.writeValue(this.agencyId);
        dest.writeValue(this.shopId);
        dest.writeValue(this.shopUserId);
        dest.writeString(this.orderTallNo);
        dest.writeString(this.orderNo);
        dest.writeValue(this.memberId);
        dest.writeString(this.userName);
        dest.writeValue(this.status);
        dest.writeValue(this.payType);
        dest.writeString(this.payInfo);
        dest.writeString(this.finishedTime);
        dest.writeSerializable(this.totalFee);
        dest.writeSerializable(this.fee);
        dest.writeSerializable(this.commission);
        dest.writeValue(this.couponId);
        dest.writeSerializable(this.couponFee);
        dest.writeValue(this.fullCutId);
        dest.writeSerializable(this.fullCutFee);
        dest.writeSerializable(this.expressFee);
        dest.writeSerializable(this.expressAddFee);
        dest.writeString(this.mobile);
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.payTime);
        dest.writeString(this.cancelTime);
        dest.writeString(this.cancelReason);
        dest.writeString(this.payCode);
        dest.writeString(this.express);
        dest.writeString(this.expressNo);
        dest.writeString(this.sendTime);
        dest.writeString(this.receiveTime);
        dest.writeString(this.returnReason);
        dest.writeString(this.address);
        dest.writeString(this.image);
        dest.writeValue(this.year);
        dest.writeValue(this.orderType);
        dest.writeString(this.joinInfo);
        dest.writeValue(this.isDeleted);
        dest.writeList(this.orderItems);
        dest.writeString(this.createTime);
        dest.writeString(this.updateTime);
        dest.writeString(this.creator);
        dest.writeString(this.updater);
        dest.writeString(this.supplierName);
        dest.writeString(this.sendFrom);
        dest.writeValue(this.totalNum);
    }

    public OrderList() {
    }

    protected OrderList(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.supplierId = (Long) in.readValue(Long.class.getClassLoader());
        this.agencyId = (Long) in.readValue(Long.class.getClassLoader());
        this.shopId = (Long) in.readValue(Long.class.getClassLoader());
        this.shopUserId = (Long) in.readValue(Long.class.getClassLoader());
        this.orderTallNo = in.readString();
        this.orderNo = in.readString();
        this.memberId = (Long) in.readValue(Long.class.getClassLoader());
        this.userName = in.readString();
        this.status = (Integer) in.readValue(Integer.class.getClassLoader());
        this.payType = (Integer) in.readValue(Integer.class.getClassLoader());
        this.payInfo = in.readString();
        this.finishedTime = in.readString();
        this.totalFee = (BigDecimal) in.readSerializable();
        this.fee = (BigDecimal) in.readSerializable();
        this.commission = (BigDecimal) in.readSerializable();
        this.couponId = (Long) in.readValue(Long.class.getClassLoader());
        this.couponFee = (BigDecimal) in.readSerializable();
        this.fullCutId = (Long) in.readValue(Long.class.getClassLoader());
        this.fullCutFee = (BigDecimal) in.readSerializable();
        this.expressFee = (BigDecimal) in.readSerializable();
        this.expressAddFee = (BigDecimal) in.readSerializable();
        this.mobile = in.readString();
        this.name = in.readString();
        this.email = in.readString();
        this.payTime = in.readString();
        this.cancelTime = in.readString();
        this.cancelReason = in.readString();
        this.payCode = in.readString();
        this.express = in.readString();
        this.expressNo = in.readString();
        this.sendTime = in.readString();
        this.receiveTime = in.readString();
        this.returnReason = in.readString();
        this.address = in.readString();
        this.image = in.readString();
        this.year = (Integer) in.readValue(Integer.class.getClassLoader());
        this.orderType = (Integer) in.readValue(Integer.class.getClassLoader());
        this.joinInfo = in.readString();
        this.isDeleted = (Integer) in.readValue(Integer.class.getClassLoader());
        this.orderItems = new ArrayList<OrderItem>();
        in.readList(this.orderItems, OrderItem.class.getClassLoader());
        this.createTime = in.readString();
        this.updateTime = in.readString();
        this.creator = in.readString();
        this.updater = in.readString();
        this.supplierName = in.readString();
        this.sendFrom = in.readString();
        this.totalNum = (int) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<OrderList> CREATOR = new Parcelable.Creator<OrderList>() {
        @Override
        public OrderList createFromParcel(Parcel source) {
            return new OrderList(source);
        }

        @Override
        public OrderList[] newArray(int size) {
            return new OrderList[size];
        }
    };


    public String getReturnAddr() {
        return returnAddr;
    }

    public void setReturnAddr(String returnAddr) {
        this.returnAddr = returnAddr;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getReturnMobi() {
        return returnMobi;
    }

    public void setReturnMobi(String returnMobi) {
        this.returnMobi = returnMobi;
    }

    public String getReturnMemo() {
        return returnMemo;
    }

    public void setReturnMemo(String returnMemo) {
        this.returnMemo = returnMemo;
    }

    public String getReturnDenyReason() {
        return returnDenyReason;
    }

    public void setReturnDenyReason(String returnDenyReason) {
        this.returnDenyReason = returnDenyReason;
    }
}
