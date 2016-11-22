package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * @ClassName:${class}
 * @Description：订单结算
 * Created by ${mty} on 2016/4/26.
 * http://blog.csdn.net/yunyuliunian
 */
public class OrderSettlement {


    private String orderTallNo;
    private double totalFee;

    private List<OrderList> orders;

    public List<OrderList> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderList> orders) {
        this.orders = orders;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public String getOrderTallNo() {
        return orderTallNo;
    }

    public void setOrderTallNo(String orderTallNo) {
        this.orderTallNo = orderTallNo;
    }

    @Override
    public String toString() {
        return "OrderSettlement{" +
               "orderTallNo='" + orderTallNo + '\'' +
               ", totalFee=" + totalFee +
               ", orders=" + orders +
               '}';
    }
}
