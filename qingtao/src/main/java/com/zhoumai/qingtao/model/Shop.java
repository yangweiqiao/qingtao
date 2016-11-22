package com.zhoumai.qingtao.model;

/**
 * Created by 刘涛 on 2016/8/26.
 */
public class Shop {


    /**
     * num : 4239
     * name : 超级供应商
     * logo : http://qingtao-img.oss-cn-hangzhou.aliyuncs.com/qingtao/2016/6/a7fe220b5b979479140d6e55e2ef03fcddd72d8a.jpg
     * expressFee : 0.1
     */

    private int num;
    private String name;
    private String logo;
    private String expressFee;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }


    public String getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(String expressFee) {
        this.expressFee = expressFee;
    }
}
