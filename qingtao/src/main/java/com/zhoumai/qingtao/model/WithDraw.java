package com.zhoumai.qingtao.model;

import java.io.Serializable;

/**
 * Created by 刘涛 on 2016/10/13.
 */

public class WithDraw implements Serializable {


    /**
     * id : 20
     * accName : 支付宝
     * accNo : yio
     * amount : 0.01
     * createTime : 2016-08-08 11:45:45
     * status : 0
     * desc : null
     */

    private Long id;
    private String accName;
    private String accNo;
    private String amount;
    private String createTime;
    private int status;
    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
