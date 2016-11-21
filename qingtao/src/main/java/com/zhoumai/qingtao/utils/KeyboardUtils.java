package com.zhoumai.qingtao.utils;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.util.Timer;
import java.util.TimerTask;

public class KeyboardUtils {
	/**
	 * 隐藏软键盘
	 *
	 * @param activity
	 */
	public static void hideSoftMethod(Activity activity) {
		try {
			if(activity.getCurrentFocus()!=null){
				// 隐藏软键盘
				((InputMethodManager) (activity
						.getSystemService(Context.INPUT_METHOD_SERVICE)))
						.hideSoftInputFromWindow(activity.getCurrentFocus()
								.getWindowToken(),
								InputMethodManager.HIDE_NOT_ALWAYS);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**

	 *

	 * @MethodName:openInputMethod

	 * @Description:打开系统软键盘

	 * @throws

	 */

	public  static void openInputMethod(final EditText editText){

		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			public void run() {

				InputMethodManager inputManager = (InputMethodManager) editText

						.getContext().getSystemService(

								Context.INPUT_METHOD_SERVICE);

				inputManager.showSoftInput(editText, 0);

			}

		}, 200);

	}

}