package com.zhoumai.qingtao.view.activity;


import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.zhoumai.qingtao.contains.Contains;
import com.zhoumai.qingtao.utils.ActivityFinishUtils;
import com.zhoumai.qingtao.utils.SpUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * Created by yangw on 2016/11/26.
 */
public class BaseActivity extends ActionBarActivity {
    protected final String HTTP_TASK_KEY = "HttpTaskKey_" + hashCode();

    /**
     * oncreat 方法  生命周期的第一个方法  创建 activitty方法
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        //全屏
//        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,
//                WindowManager.LayoutParams. FLAG_FULLSCREEN);

// 无标题
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        /**
         *获取并且保存当前屏幕的尺寸
         */

        //记录activity到集合
        ActivityFinishUtils.addActivity(this);

//设置通知栏的颜色
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            //设置为透明
            tintManager.setStatusBarTintResource(android.R.color.white);//通知栏所需颜色
        }
// TODO: 2016/12/7  标题栏文字颜色
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setMiuiStatusBarDarkMode(this,true);

    }

    /**
     * 安卓4.4以下的没有通知栏透明的效果
     *
     * @param on
     */
    @TargetApi(19)
    private void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }


    public static boolean setMiuiStatusBarDarkMode(Activity activity, boolean darkmode) {
        Class<? extends Window> clazz = activity.getWindow().getClass();
        try {
            int darkModeFlag = 0;
            Class<?> layoutParams = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            Field field = layoutParams.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
            darkModeFlag = field.getInt(layoutParams);
            Method extraFlagField = clazz.getMethod("setExtraFlags", int.class, int.class);
            extraFlagField.invoke(activity.getWindow(), darkmode ? darkModeFlag : 0, darkModeFlag);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    //这个方法 是判断用户是否登录 如果不需要每个界面都判断 只需要将该方法换个名字 然后在子类中访问就可以了就可以
    @Override
    protected void onStart() {
        super.onRestart();


        /**
         * 判断用户是否登录
         */
        boolean aBoolean = SpUtils.getBoolean(Contains.LOGIN);
        // if(!aBoolean){startActivityForResult(new Intent(this,LoginActivity.class),0);}

    }


    /**
     * 获取上下文
     *
     * @return
     */

    public Context getConText() {
        return this;
    }


    /**
     * 销毁界面的方法  在这可以取消当前界面的网络请求
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();


    }

}
