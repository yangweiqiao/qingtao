package com.zhoumai.qingtao.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 常用工具类
 * 
 * @author Hoyn
 * 
 */
public class Util {
	/**
	 * 字符串转为utf-8
	 * 
	 * @param content
	 * @return
	 */
	public static String toUtf_8(String content) {
		byte[] bytes = null;
		try {
			bytes = content.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return URLEncoder.encode(new String(bytes));
	}
}
