package com.zhoumai.qingtao.http;

/** Json请求回调接口 */
public interface JsonRequestCallback {

	/** 当请求结束的时候调用这个方法 */
	void onRequestFinish(String json);
}
