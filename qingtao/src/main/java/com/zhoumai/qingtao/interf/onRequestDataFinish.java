package com.zhoumai.qingtao.interf;


/**
 * 数据请求完毕之后调用
 */

@SuppressWarnings("unused")
public interface onRequestDataFinish {

    /**
     * 数据请求完成调用
     **/
    void requestdataFinish(String xml);

    /**
     * 数据请求失败
     **/
    void requestdataFailed();


}
