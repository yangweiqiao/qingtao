package com.zhoumai.qingtao.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.KeyEvent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.NET.Api;
import com.zhoumai.qingtao.NET.NetUtils;
import com.zhoumai.qingtao.NET.onRequestDataFinish;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.Toastutils;
import com.zhoumai.qingtao.view.base.application.MyApp;
import com.zhoumai.qingtao.view.customview.NoscrollViewPager;
import com.zhoumai.qingtao.view.fragment.CategoryFragment;
import com.zhoumai.qingtao.view.fragment.GoodsFragment;
import com.zhoumai.qingtao.view.fragment.HomeFragment;
import com.zhoumai.qingtao.view.fragment.MeFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 程序的主界面
 */
public class MainActivity extends BaseActivity implements   RadioGroup.OnCheckedChangeListener {


    @BindView(R.id.home_tab)
    RadioButton homeTab;
    @BindView(R.id.category_tab)
    RadioButton categoryTab;
    @BindView(R.id.goods_tab)
    RadioButton goodsTab;
    @BindView(R.id.me_tab)
    RadioButton meTab;
    @BindView(R.id.home_tab_group)
    RadioGroup homeTabGroup;
    @BindView(R.id.noscrollViewPager)
    NoscrollViewPager noscrollViewPager;


    ArrayList<Fragment> fragments = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        /**
         * 初始化数据
         */

        initDatas();
/**
 * 初始化监听器 主要是底部的按钮
 */
        initListener();

    }


    private void initListener() {
        //设置viewpager的默认加载页数
        noscrollViewPager.setOffscreenPageLimit(fragments.size() - 1);
        //默认显示首页
        noscrollViewPager.setCurrentItem(0);

/**
 * 底部的radiogroup的监听事件
 */
        homeTabGroup.setOnCheckedChangeListener(this);

    }


    /**
     * 初始化数据
     **/
    private void initDatas() {
        /**
         * 添加四个fragment到集合中
         */
        fragments.add(new HomeFragment());  //首页
        fragments.add(new CategoryFragment()); //分类
        fragments.add(new GoodsFragment());//订单购物车
        fragments.add(new MeFragment());//我的
        /**
         * 设置适配器
         */
        noscrollViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {//注意获取的是getSupportFragmentManager 为了兼容版本
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

        });

    }


    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub

        // NetUtils.requestData(Api.ACCOUNT_SAVE, null, this, false);
        super.onDestroy();

    }


    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {


        switch (checkedId) {
            case R.id.home_tab:
                noscrollViewPager.setCurrentItem(0, false);
                break;
            case R.id.category_tab:
                noscrollViewPager.setCurrentItem(1, false);
                break;
            case R.id.goods_tab:
                noscrollViewPager.setCurrentItem(2, false);
                break;
            case R.id.me_tab:
                noscrollViewPager.setCurrentItem(3, false);
                break;
        }
    }


    /**
     * 菜单、返回键响应 监听的事件
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK) {//判断按键是返回键
            exitBy2Click(); //调用双击退出函数
        }
        return false;
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
            Toastutils.showToast("再按一次退出程序");
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


}