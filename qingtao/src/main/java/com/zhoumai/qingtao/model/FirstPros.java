package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/5/17.
 * 首页三张图
 */
public class FirstPros {
    Index limitFirst;
    Index groupFirst;
    Index topFirst;

    public Index getLimitFirst() {
        return limitFirst;
    }

    public FirstPros setLimitFirst(Index limitFirst) {
        this.limitFirst = limitFirst;
        return this;
    }

    public Index getGroupFirst() {
        return groupFirst;
    }

    public FirstPros setGroupFirst(Index groupFirst) {
        this.groupFirst = groupFirst;
        return this;
    }

    public Index getTopFirst() {
        return topFirst;
    }

    public FirstPros setTopFirst(Index topFirst) {
        this.topFirst = topFirst;
        return this;
    }
}
