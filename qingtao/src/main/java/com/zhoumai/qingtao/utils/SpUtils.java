package com.zhoumai.qingtao.utils;
import android.content.Context;

import com.zhoumai.qingtao.view.base.application.MyApp;

public class SpUtils {
	private static final String NAME = "config";
	/**
	 * 获取布尔值
	 * 
	 * @param value
	 *            传入记录的变量名
	 * @return 返回保存的具体的boolean值
	 */
	public static boolean getBoolean(String value) {
		return MyApp.getContext()
				.getSharedPreferences(NAME, Context.MODE_PRIVATE)
				.getBoolean(value, false);
	}
	/**
	 * 获取保存的字符串
	 * 
	 * @param key
	 * 
	 * @return
	 */
	public static String getString(String key) {
		return MyApp.getContext()
				.getSharedPreferences(NAME, Context.MODE_PRIVATE)
				.getString(key, null);
	}
	/**
	 * 获取保存的int类型的值
	 * 
	 * @param key
	 * @param key
	 * @param key
	 * @return
	 */
	public static int getInt(String key) {
		return MyApp.getContext()
				.getSharedPreferences(NAME, Context.MODE_PRIVATE)
				.getInt(key, -1);
	}
	/**
	 * 存储int值
	 * 
	 * @param key
	 * @param value
	 */
	public static void setInt(String key, int value) {
		MyApp.getContext().getSharedPreferences(NAME, Context.MODE_PRIVATE)
				.edit().putInt(key, value).commit();
	}
	/**
	 * 存储boolean值
	 * 
	 * @param key
	 * @param value
	 */
	public static void setBoolean(String key, boolean value) {
		MyApp.getContext().getSharedPreferences(NAME, Context.MODE_PRIVATE)
				.edit().putBoolean(key, value).commit();
	}
	/**
	 * 存储string值
	 * 
	 * @param key
	 * @param value
	 */
	public static void setString(String key, String value) {
		MyApp.getContext().getSharedPreferences(NAME, Context.MODE_PRIVATE)
				.edit().putString(key, value).commit();
	}


}