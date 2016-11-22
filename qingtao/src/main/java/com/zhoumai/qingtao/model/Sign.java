package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by Administrator on 2016/5/17.
 */
public class Sign {
    private String date;
    private int isTodaySign;
    private int points;
    private List<SignDays> list;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIsTodaySign() {
        return isTodaySign;
    }

    public void setIsTodaySign(int isTodaySign) {
        this.isTodaySign = isTodaySign;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<SignDays> getList() {
        return list;
    }

    public void setList(List<SignDays> list) {
        this.list = list;
    }
}
