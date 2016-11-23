package com.zhoumai.qingtao.NET;

/** Json请求回调接口 */
public interface JsonRequestCallback {

	/** 当请求结束的时候调用这个方法 */
	@SuppressWarnings("unused")
	void onRequestFinish(String json);
}
