package com.zhoumai.qingtao.utils;
import android.widget.Toast;

import com.zhoumai.qingtao.base.baseapplication.MyApp;

/**
 * Created by yangweiqiao on 2016/8/24.
 */

public class ToastUtils {
    private static Toast toast;
    /**
     * 强大的吐司，能够连续弹的吐司
     * @param text
     */
    public static void showToast(String text){
        if(toast==null){
            //如果等于null，则创建
            toast = Toast.makeText(MyApp.getContext(), text,Toast.LENGTH_SHORT);
        }else {
            //如果不等于空，则直接将text设置给toast
            toast.setText(text);
        }
        toast.show();
    }
}
