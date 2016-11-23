package com.zhoumai.qingtao.view.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.zhoumai.qingtao.R;


/**
 * 状态布局，封装了4种状态：正在加载、加载失败、加载为空、正常界面
 * @author dzl
 *
 */
public class StateLayout extends FrameLayout {

	private View loadingView;
	private View failView;
	private View emptyView;
	/** 正常界面的View */
	private View contentView;

	public StateLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/** 当布局填充结束的时候会调用 */
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		loadingView = findViewById(R.id.loadingView);
		failView = findViewById(R.id.failView);
		emptyView = findViewById(R.id.emptyView);
		showLoadingView();
	}
	
	/** 显示正在加载的View */
	public void showLoadingView() {
		showView(loadingView);
	}
	
	/** 显示加载失败的View */
	public void showFailView() {
		showView(failView);
	}
	
	/** 显示加载为空的View */
	public void showEmptyView() {
		showView(emptyView);
	}
	
	/** 显示正常界面的View */
	public void showContentView() {
		showView(contentView);
	}

	/**
	 * 显示指定状态的View，并且隐藏其它状态的View
	 * @param view
	 */
	private void showView(View view) {
		// 遍历StateLayout容器中所有的子View
		for (int i = 0; i < getChildCount(); i++) {
			View child = getChildAt(i);
			child.setVisibility(child == view ? View.VISIBLE : View.GONE);
		}
	}

	/**
	 * 设置正常界面的View
	 * @param contentViewOrLayoutId 可以是一个View，也可以是一个布局id
	 */
	public void setContentView(Object contentViewOrLayoutId) {
		if (contentViewOrLayoutId == null) {
			throw new IllegalArgumentException("必须要给Fragemnt的getContentView方法返回一个布局id，或者设置一个View");
		}
		
		if (contentViewOrLayoutId instanceof Integer) {
			// 如果是一个布局id
			int layoutId = (Integer) contentViewOrLayoutId;
			contentView = View.inflate(getContext(), layoutId, null);
		} else {
			// 如果是一个View
			contentView = (View) contentViewOrLayoutId;
		}
		
		addView(contentView);	// 把正常界面的View添加到状态容器中进行展示
		contentView.setVisibility(View.GONE);	// 默认显示LoadingView
	}

}
