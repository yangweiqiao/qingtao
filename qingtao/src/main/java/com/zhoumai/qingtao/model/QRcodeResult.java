package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/5/5.
 */
public class QRcodeResult {
    private String twoCode;

    private String url;

    public String getTwoCode() {
        return twoCode;
    }

    public QRcodeResult setTwoCode(String twoCode) {
        this.twoCode = twoCode;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public QRcodeResult setUrl(String url) {
        this.url = url;
        return this;
    }
}
