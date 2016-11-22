package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by ${张科} on 2016/5/5.
 * 粉丝返回记得结果
 */
public class FansResult {
    private  int levelOne;
    private  int levelTwo;
    private int levelThree;

    private List<Fans> list1;
    private List<Fans> list2;
    private List<Fans> list3;

    public int getLevelOne() {
        return levelOne;
    }

    public FansResult setLevelOne(int levelOne) {
        this.levelOne = levelOne;
        return this;
    }

    public int getLevelTwo() {
        return levelTwo;
    }

    public FansResult setLevelTwo(int levelTwo) {
        this.levelTwo = levelTwo;
        return this;
    }

    public int getLevelThree() {
        return levelThree;
    }

    public FansResult setLevelThree(int levelThree) {
        this.levelThree = levelThree;
        return this;
    }

    public List<Fans> getList1() {
        return list1;
    }

    public FansResult setList1(List<Fans> list1) {
        this.list1 = list1;
        return this;
    }

    public List<Fans> getList2() {
        return list2;
    }

    public FansResult setList2(List<Fans> list2) {
        this.list2 = list2;
        return this;
    }

    public List<Fans> getList3() {
        return list3;
    }

    public FansResult setList3(List<Fans> list3) {
        this.list3 = list3;
        return this;
    }
}
