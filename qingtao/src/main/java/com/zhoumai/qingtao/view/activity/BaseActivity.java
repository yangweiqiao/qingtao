package com.zhoumai.qingtao.view.activity;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;

import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.contains.Contains;
import com.zhoumai.qingtao.utils.Global;
import com.zhoumai.qingtao.utils.SpUtils;
import com.zhoumai.qingtao.utils.T;
import com.zhoumai.qingtao.view.base.application.MyApp;
import com.zhy.autolayout.AutoLayoutActivity;

import java.util.Timer;
import java.util.TimerTask;




/**
 * Created by yangw on 2016/11/26.
 */
public class BaseActivity  extends AutoLayoutActivity    {
    protected final String HTTP_TASK_KEY = "HttpTaskKey_" + hashCode();

    /**
     * oncreat 方法  生命周期的第一个方法  创建 activitty方法
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         *获取并且保存当前屏幕的尺寸
         */



    }




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
     * 菜单、返回键响应 监听的事件
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {//判断按键是返回键
            exitBy2Click(); //调用双击退出函数
        }
        return false;
    }


    /**
     * 获取上下文
     * @return
     */

    public Context getConText() {
        return this;
    }


    /**
     * 获取http任务的标记
     * @return
     */

    public String getHttpTaskKey() {
        return HTTP_TASK_KEY;
    }

    /**
     * 双击退出的方法
     */
    //设置标记
    private static Boolean isExit = false;

    private void exitBy2Click() {
        Timer tExit = null;
        if (isExit == false) {
            isExit = true; // 准备退出
 //提示用户
            T.showToast("再按一次退出程序");
            //创建Timer对象
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else { //退出应用
            finish();
            MobclickAgent.onKillProcess(MyApp.getContext());//结束统计 保存数据
            System.exit(0);
        }
    }


    /**
     * 销毁界面的方法  在这可以取消当前界面的网络请求
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();


    }

}
