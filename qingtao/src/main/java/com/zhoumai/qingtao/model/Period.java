package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/5/12.
 *限时 后 返回时间段
 */
public class Period {
    private int  periodId;
    private int status;
    private String name;
    private String startTime;
    private String endTime;
    private Long now;

    public int getPeriodId() {
        return periodId;
    }

    public Period setPeriodId(int periodId) {
        this.periodId = periodId;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public Period setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getName() {
        return name;
    }

    public Period setName(String name) {
        this.name = name;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public Period setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public Period setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    public Long getNow() {
        return now;
    }

    public void setNow(Long now) {
        this.now = now;
    }
}
