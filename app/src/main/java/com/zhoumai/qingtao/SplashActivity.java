package com.zhoumai.qingtao;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.zhoumai.qingtao.utils.MyApp;
import com.zhoumai.qingtao.utils.SpUtils;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * splash界面
 */
public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {
    //动画
    private AlphaAnimation animation;
    //延迟时间
    private final int SPLASH_DISPLAY_LENGHT = 2000;
    @BindView(R.id.splash)
    ImageView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);
        ButterKnife.bind(this);
        //初始化动画
        initAnimation();
        //初始化监听
        initListener();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {



            }
        }, SPLASH_DISPLAY_LENGHT);
    }

    /**
     * 初始化监听
     */
    private void initListener() {
        animation.setAnimationListener(this);
    }

    /**
     * 初始化动画
     */
    private void initAnimation() {
        //创建动画 渐变动画
        animation = new AlphaAnimation(0.5f, 1.0f);
        //设置时间
        animation.setDuration(2000);
        //开启动画
        splash.startAnimation(animation);
    }

    /**
     * 下面是动画结束的监听方法
     *
     * @param animation
     */
    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
/*
动画结束之后 判断用户是否是第一次登陆
 */
        boolean is_frist = SpUtils.getBoolean(MyApp.IS_FRIST);//默认值是false 表示用户第一次登陆  登陆成功之后可以存储为true
        //创建意图
         Intent intent;
        if(!is_frist){
            //进入引导界面
            intent   = new Intent(SplashActivity.this, GuideActivity.class);

            startActivity(intent);//显示主窗口
        }else {
            //直接进入直接面
          intent   = new Intent(SplashActivity.this, MainActivity.class);

            startActivity(intent);//显示主窗口

        }

        //无论进入那个界面 都需要关闭当前的splash界面
        finish();//关闭当前界面
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
