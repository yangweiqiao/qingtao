package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/5/5.
 * 粉丝
 */
public class Fans {
    private int id;
    private String mobi;
    private String createTime;
    private String logo;
    private String sex;
    private String name;

    public int getId() {
        return id;
    }

    public Fans setId(int id) {
        this.id = id;
        return this;
    }

    public String getMobi() {
        return mobi;
    }

    public Fans setMobi(String mobi) {
        this.mobi = mobi;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public Fans setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public Fans setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Fans setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getName() {
        return name;
    }

    public Fans setName(String name) {
        this.name = name;
        return this;
    }
}
