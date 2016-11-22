package com.zhoumai.qingtao.model;

import java.io.Serializable;

/**
 * Created by ${张科} on 2016/4/13.
 * 我的提现账户
 */
public class CashAccount implements Serializable {
    private Long id;
    private Long userId;
    private Integer type; // 类型 1-支付宝 2-银行卡 3-微信
    private String userName; //姓名
    private String accName; // 支付宝  微信 招商银行  广发银行  。。。。
    private String accCode; // 银行卡号，支付宝账号，微信号
    private Integer isDeleted;

    public Long getUserId() {
        return userId;
    }

    public CashAccount setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public CashAccount setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public CashAccount setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getAccName() {
        return accName;
    }

    public CashAccount setAccName(String accName) {
        this.accName = accName;
        return this;
    }

    public String getAccCode() {
        return accCode;
    }

    public CashAccount setAccCode(String accCode) {
        this.accCode = accCode;
        return this;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public CashAccount setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Long getId() {
        return id;
    }

    public CashAccount setId(Long id) {
        this.id = id;
        return this;
    }
}
