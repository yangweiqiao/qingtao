package com.zhoumai.qingtao.view.fragment;


import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.umeng.analytics.MobclickAgent;
import com.viewpagerindicator.TabPageIndicator;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;
import com.zhoumai.qingtao.view.fragment.homeFragment.BrandFragment;
import com.zhoumai.qingtao.view.fragment.homeFragment.CashBackFragment;
import com.zhoumai.qingtao.view.fragment.homeFragment.HomeHomeFragment;
import com.zhoumai.qingtao.view.fragment.homeFragment.LimitedFragment;
import com.zhoumai.qingtao.view.fragment.homeFragment.SpeelGroupFragment;

import java.util.ArrayList;

/**
 * Created by 杨伟乔 on 2016/11/23.
 * 邮箱:  yangweiqiao@126.com
 * CSDN: www.csdn.net/yangweiqiao
 * 神兽保佑,代码永无BUG
 */

public class GoodsFragment extends BaseFragemnt  {

    TabPageIndicator homeindicator;

    ViewPager homeviewpager;





    @Override
    public CharSequence getTitle() {
        return "订单";
    }

    @Override
    public Object getContentView() {


/**这个地方可以直接返回加载成功之后的id**/

        TextView textView = new TextView(context);
        textView.setText("首页的首页");
        textView.setTextColor(Color.BLUE);
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {

        homeindicator = findView(R.id.home_indicator);//首页的指示器控件


        homeviewpager = findView(R.id.home_viewpager);//viewpager控件



    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
//创建子界面集合
        ArrayList<BaseFragemnt>  fragments = new ArrayList<>();

        fragments.add(new HomeHomeFragment());
        fragments.add(new LimitedFragment());
        fragments.add(new SpeelGroupFragment());
        fragments.add(new BrandFragment());
        fragments.add(new CashBackFragment());



       //设置适配器  传递的时候要把子界面也传递过去
        homeviewpager.setAdapter(new TabFragmentAdapter(getChildFragmentManager(),fragments));

        //绑定指示器
        homeindicator.setViewPager(homeviewpager);


        stateLayout.showContentView();
    }


    @Override
    public void requestdataFinish(String catalog, String json) {

    }

    @Override
    public void requestdataFailed() {

    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("GoodsFragment"); //统计页面，"MainScreen"为页面名称，可自定义
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("GoodsFragment");
    }
}
