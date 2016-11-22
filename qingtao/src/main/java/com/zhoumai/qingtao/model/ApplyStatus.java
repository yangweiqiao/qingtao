package com.zhoumai.qingtao.model;

/**
 * Created by 刘涛 on 2016/5/31.
 */
public class ApplyStatus {
    private int status;
    private int newUserId;
    private String username;

    public int getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(int newUserId) {
        this.newUserId = newUserId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
