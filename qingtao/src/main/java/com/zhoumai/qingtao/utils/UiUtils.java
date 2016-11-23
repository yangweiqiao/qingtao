package com.zhoumai.qingtao.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.zhoumai.qingtao.view.base.application.MyApp;

import java.util.Random;

/***
 * 封装Ui相关的工具类
 * @author dzl
 *
 */
public class UiUtils {

	/**
	 * 在屏幕的中央显示一个Toast
	 * @param text
	 */
	public static void showToast (CharSequence text) {
		Toast toast = Toast.makeText(MyApp.getContext(), text, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);// 设置Toast的显示位置在屏幕的中央
		toast.show();
	}

	/**
	 * 把一个dp单位的值转换为px（像素）
	 * @param dp
	 * @return
	 */
	public static int dp2px(int dp) {
		float density = MyApp.getContext().getResources().getDisplayMetrics().density;	// 获取屏幕密度
		int px = (int) (dp * density + 0.5);	// 加0.5是为了四舍五入
		return px;
	}

	/** 创建一个颜色颜色 */
	public static int createRandomColor() {
		Random random = new Random();
		int red = 50 + random.nextInt(151);// 50 ~ 200
		int green = 50 + random.nextInt(151);// 50 ~ 200
		int blue = 50 + random.nextInt(151);// 50 ~ 200
		int color = Color.rgb(red, green, blue);
		return color;
	}

	/** 创建一个带有随机颜色选择器的TextView */
	@SuppressWarnings("deprecation")
	public static TextView createRandomColorSelectorTextView(Context context) {
		final TextView textView = new TextView(context);
		textView.setTextColor(Color.WHITE);
		int padding = dp2px(6);
		textView.setPadding(padding, padding, padding, padding);
		textView.setGravity(Gravity.CENTER);
		textView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showToast(textView.getText());
			}
		});
		textView.setBackgroundDrawable(createRandomColorSelector());
		return textView;
	}

	/** 创建一个随机颜色选择器 */
	private static Drawable createRandomColorSelector() {
		// 创建一个选择器对象
		StateListDrawable stateListDrawable = new StateListDrawable();
		
		// 创建一个按下状态和按下状态要显示的Drawable
		int[] pressedState = {android.R.attr.state_pressed, android.R.attr.state_enabled};
		Drawable pressedDrawable = createRandomColorDrawable();
		
		// 创建一个正常状态和正常状态要显示的Drawable
		int[] normalState = {};
		Drawable normalDrawable = createRandomColorDrawable();
		
		stateListDrawable.addState(pressedState, pressedDrawable);
		stateListDrawable.addState(normalState, normalDrawable);
		return stateListDrawable;
	}

	/** 创建一个随机颜色的圆角矩形 */
	private static Drawable createRandomColorDrawable() {
		// 创建一个图形对象
		GradientDrawable gradientDrawable = new GradientDrawable();
		gradientDrawable.setShape(GradientDrawable.RECTANGLE);// 设置图形为矩形
		gradientDrawable.setCornerRadius(dp2px(5));			// 设置矩形的圆角角度
		gradientDrawable.setColor(createRandomColor());		// 设置矩形的颜色
		return gradientDrawable;
	}
	
}
