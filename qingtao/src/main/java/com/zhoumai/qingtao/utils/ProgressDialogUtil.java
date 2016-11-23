package com.zhoumai.qingtao.utils;

import java.lang.ref.WeakReference;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.view.WindowManager;

public class ProgressDialogUtil {
	private static ProgressDialog progress;
	private static WeakReference<Context> contextReference;
	public static void showProgress(Context context, String message) {
		showProgress(context);
		setMessage(message);
	}

	/**
	 * 通过setMessage和showProgress，可以实现进度条的显示 在按后退键的时候消失且不会再弹对话框。
	 * 
	 * @param message
	 */
	public static void setMessage(String message) {
		progress.setMessage(message);
	}

	public static void showProgress(Context context) {
		if (contextReference==null||contextReference.get()!=context) {
			contextReference = new WeakReference<Context>(context);
			progress = new ProgressDialog(contextReference.get());
		}
		progress.setCanceledOnTouchOutside(false);
		if (!progress.isShowing()) {
			progress.show();
		}
	}

	public static void dismiss() {
		if (progress != null && progress.isShowing()) {
			progress.dismiss();
		}
	}

	public static boolean isShowing() {
		return progress.isShowing();
	}
}
