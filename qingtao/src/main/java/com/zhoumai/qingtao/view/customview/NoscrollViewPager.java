package com.zhoumai.qingtao.view.customview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoscrollViewPager extends ViewPager {

	public NoscrollViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	// 把ViewPager默认的处理触摸事件的功能去掉
	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		return false;// 去掉父类默认的处理事件的方法，自己不需要处理事件
	}
	
	// 不拦截孩子的事件
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		return false;// false 是不拦截事件，事件传递给孩子
	}

}
