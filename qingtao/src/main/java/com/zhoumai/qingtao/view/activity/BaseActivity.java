package com.zhoumai.qingtao.view.activity;


import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.contains.Contains;
import com.zhoumai.qingtao.utils.SpUtils;
import com.zhoumai.qingtao.utils.T;
import com.zhoumai.qingtao.view.base.application.MyApp;

import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by yangw on 2016/11/26.
 */
public class BaseActivity  extends FragmentActivity{

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            setTranslucentStatus(true);
//            SystemBarTintManager tintManager = new SystemBarTintManager(this);
//            tintManager.setStatusBarTintEnabled(true);
//            tintManager.setStatusBarTintResource(android.R.color.transparent);//通知栏所需颜色
//        }
//
//    }
//
//    @TargetApi(19)
//    private void setTranslucentStatus(boolean on) {
//        Window win = getWindow();
//        WindowManager.LayoutParams winParams = win.getAttributes();
//        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
//        if (on) {
//            winParams.flags |= bits;
//        } else {
//            winParams.flags &= ~bits;
//        }
//        win.setAttributes(winParams);
//    }

//这个方法 是判断用户是否登录 如果不需要每个界面都判断 只需要将该方法换个名字 然后在子类中调用就可以
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
     * 菜单、返回键响应
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            exitBy2Click(); //调用双击退出函数
        }
        return false;
    }
    /**
     * 双击退出函数
     */
    private static Boolean isExit = false;

    private void exitBy2Click() {
        Timer tExit = null;
        if (isExit == false) {
            isExit = true; // 准备退出
//            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            T.showToast("再按一次退出程序");
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else {
            finish();
            MobclickAgent.onKillProcess(MyApp.getContext());//结束统计 保存数据
            System.exit(0);
        }
    }


}
