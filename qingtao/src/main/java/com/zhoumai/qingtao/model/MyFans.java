package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by ${张科} on 2016/5/5.
 */
public class MyFans {
    private  int levelOne;
    private String levelName;
    private List<Fans> list;


    public int getLevelOne() {
        return levelOne;
    }

    public MyFans setLevelOne(int levelOne) {
        this.levelOne = levelOne;
        return this;
    }

    public String getLevelName() {
        return levelName;
    }

    public MyFans setLevelName(String levelName) {
        this.levelName = levelName;
        return this;
    }

    public List<Fans> getList() {
        return list;
    }

    public MyFans setList(List<Fans> list) {
        this.list = list;
        return this;
    }
}
