package com.zhoumai.qingtao.view.fragment;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.umeng.analytics.MobclickAgent;
import com.viewpagerindicator.TabPageIndicator;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.view.activity.SearchActivity;
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

public class HomeFragment extends BaseFragemnt implements View.OnClickListener {
    /**
     * 控件初始化
     */
    private TabPageIndicator homeindicator;
    private ViewPager homeviewpager;
    private ImageView search;

    @Override
    public CharSequence getTitle() {
        return "首页";
    }

    @Override
    public Object getContentView() {
/**这个地方可以直接返回加载成功之后的布局id
 * 在基类里面有一个方法是设置的
 *
 **/

        View view = View.inflate(context, R.layout.fragment_home, null);
//        return R.layout.fragment_home;
     return view;
    }


    @Override
    public void initView() {
        //这里是为了测试 后面直接黄油刀找控件
        homeindicator = findView(R.id.home_indicator);//首页的指示器控件
        homeviewpager = findView(R.id.home_viewpager);//viewpager控件
         //搜索的按钮设置
        search = findView(R.id.ib_titlebar_sousuo);
        search.setBackgroundResource(R.mipmap.search);

    }

    @Override
    public void initListener() {
        search.setOnClickListener(this);
    }

    @Override
    public void initData() {
//创建子界面集合
        ArrayList<BaseFragemnt> fragments = new ArrayList<>();
//添加子界面到集合中
        fragments.add(new HomeHomeFragment());
        fragments.add(new LimitedFragment());
        fragments.add(new SpeelGroupFragment());
        fragments.add(new BrandFragment());
        fragments.add(new CashBackFragment());





        //设置适配器  传递的时候要把子界面也传递过去
        // TODO: 2016/12/3 这个地方注意要传递的是childFragmentManager 如果直接获取管理者就会出现没有动画的效果
        homeviewpager.setAdapter(new TabFragmentAdapter(childFragmentManager, fragments));
        //绑定指示器  如果不绑定起不到联动的作用

        homeindicator.setViewPager(homeviewpager);
//显示页面
        stateLayout.showContentView();
    }

    /**
     * 网络的请求回调 数据请求成功
     *
     * @param catalog 根据catalog来判断是哪个回调
     * @param
     */


    @Override
    public void requestdataFinish(String catalog, Object bean) {

    }

    /**
     * 网络请求失败
     */
    @Override
    public void requestdataFailed() {

    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("进入主界面"); //统计页面，"MainScreen"为页面名称，可自定义
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("暂停主界面");
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.ib_titlebar_sousuo:
                //分享按钮 首页对应的是点击的搜索
                Intent intent = new Intent(context, SearchActivity.class);

                startActivity(intent);


        }

    }
}
