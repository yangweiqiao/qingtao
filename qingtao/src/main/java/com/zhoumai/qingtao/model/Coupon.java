package com.zhoumai.qingtao.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2016/5/3.
 */
public class Coupon {
    private boolean flag;// true 标题  false 优惠券
    private Long id;
    private Long shopId;
    private Long adminUserId;
    private String name;               //名字
    private BigDecimal money;          //面值
    private Integer moneyLimit;        //0：直接使用  1：满足amount金额才能使用
    private BigDecimal amount;         //满足金额
    private Integer userUpLimit;          //用户获取上限   0:无限制
    private Integer total;                //发放总量
    private Integer residual;             //剩余
    private String startTime;            //生效时间
    private String endTime;              //过期时间
    private Integer useScope;          //0：全店铺使用    1:指定产品使用
    private Integer rule1;             //0:~   1:原价购买商品时可用
    private Integer rule2;             //0:~   1:允许积分兑换优惠券
    private double score;              //兑换当前优惠券需要的积分
    private String explain;            //说明
    public List<Long> ids;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Long adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getMoneyLimit() {
        return moneyLimit;
    }

    public void setMoneyLimit(Integer moneyLimit) {
        this.moneyLimit = moneyLimit;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getUserUpLimit() {
        return userUpLimit;
    }

    public void setUserUpLimit(Integer userUpLimit) {
        this.userUpLimit = userUpLimit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getResidual() {
        return residual;
    }

    public void setResidual(Integer residual) {
        this.residual = residual;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getUseScope() {
        return useScope;
    }

    public void setUseScope(Integer useScope) {
        this.useScope = useScope;
    }

    public Integer getRule1() {
        return rule1;
    }

    public void setRule1(Integer rule1) {
        this.rule1 = rule1;
    }

    public Integer getRule2() {
        return rule2;
    }

    public void setRule2(Integer rule2) {
        this.rule2 = rule2;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
