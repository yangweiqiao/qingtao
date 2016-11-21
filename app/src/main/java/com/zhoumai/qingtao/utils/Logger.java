package com.zhoumai.qingtao.utils;

import android.util.Log;
public class Logger {
	/**
	 * 用于控制控制控制台所有的log的输出,true输出,false不输出 
	 */
	public static boolean showLog=true;
	
	/**输出info级别的log信息*/
	
	public static void i(Object objectTag , Object objectMsg  )
	{
		if(showLog){
			
			String tag = convertAsStringTag(objectTag);
			String msg =convertAsStringMsg(objectMsg) ;
			Log.i(tag, msg);
		}
		
		
		
	}
/**  把任意类型的消息转换成string类型的 */
	private static String convertAsStringMsg(Object objectMsg) {
           String msg;
  if(objectMsg==null){
	  msg="null";
  }else {
	  msg=objectMsg.toString();//转换为只字符串
  }
		
		
		return msg;
	}
/** 把任意类型的Tag转换为字符串类型的 */
	private static String convertAsStringTag(Object objectTag) {
		String tag;
	 if(objectTag==null){
		 tag = "null";
	 }else if (objectTag instanceof String){
		 tag =  (String) objectTag;
	 }else if (objectTag instanceof Class){
		 tag = ((Class) objectTag).getSimpleName();
		 
	 }else {
		 tag = objectTag.getClass().getSimpleName();
	 }
	 
		return tag;
	}	
	
}