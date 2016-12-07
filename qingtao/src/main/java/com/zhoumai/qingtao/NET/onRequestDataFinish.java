package com.zhoumai.qingtao.NET;






import java.lang.reflect.Type;

/**
 * 数据请求完毕之后调用
 */

@SuppressWarnings("unused")
public interface onRequestDataFinish {

    /**
     * 数据请求完成调用
     **/
    void requestdataFinish(String catalog, Object bean);

    /**
     * 数据请求失败
     **/
    void requestdataFailed();


}
