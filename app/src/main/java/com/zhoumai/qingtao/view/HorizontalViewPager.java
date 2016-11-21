package com.zhoumai.qingtao.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 viewpager
 */

public class HorizontalViewPager extends ViewPager {

	private int downX;
	private int downY;

	public HorizontalViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	/**
	 * 
	 * 根据业务处理事件
	 * 
	 * 1、上下滑动，不需要事件 getParent().requestDisallowInterceptTouchEvent(false);
	 * 2、左右滑动
	 * 		2.1、当处于第一页时，且手指从左往右，不需要事件
	 * 		2.2、当处于最后一页时，且手指从右往左，不需要事件
	 * 		2.3、其他情况都需要事件getParent().requestDisallowInterceptTouchEvent(true);
	 */
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			downX = (int) ev.getX();
			downY = (int) ev.getY();
			getParent().requestDisallowInterceptTouchEvent(true);// 在down时，请求父容器把剩下的事件都传递下来
			break;
		case MotionEvent.ACTION_MOVE:
			int moveX = (int) ev.getX();
			int moveY = (int) ev.getY();
			
			// 水平移动距离
			int diffX = moveX - downX;
			// 垂直距离
			int diffY = moveY - downY;
			if(Math.abs(diffY)>Math.abs(diffX)){// 1、上下滑动，不需要事件
				getParent().requestDisallowInterceptTouchEvent(false);
			}else{//2、左右滑动
				// 2.1、当处于第一页时，且手指从左往右，不需要事件
				if(getCurrentItem()==0&&diffX>0){
					getParent().requestDisallowInterceptTouchEvent(false);
				}
				// 2.2、当处于最后一页时，且手指从右往左，不需要事件
				else if(getCurrentItem()==getAdapter().getCount()-1&&diffX<0){
					getParent().requestDisallowInterceptTouchEvent(false);
				}
				// 2.3、其他情况都需要事件
				else{
					getParent().requestDisallowInterceptTouchEvent(true);
				}
			}
			break;

		default:
			break;
		}
		return super.dispatchTouchEvent(ev);
	}

}
