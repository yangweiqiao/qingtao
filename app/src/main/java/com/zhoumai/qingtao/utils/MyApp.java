package com.zhoumai.qingtao.utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/11/21.
 */
public class MyApp  extends Application{
   static  Context context;

    public static String IS_FRIST="is_frist";

    @Override
    public void onCreate() {
        super.onCreate();
      this.context  =this;
    }


    public static Context getContext() {
        return context;
    }
}
