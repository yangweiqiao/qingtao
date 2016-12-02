package com.zhoumai.qingtao.view.fragment.homeFragment;

import android.graphics.Color;
import android.widget.TextView;

import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;

/**
 * Created by ${杨伟乔} on 2016/11/30.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class HomeHomeFragment extends BaseFragemnt{
    @Override
    public CharSequence getTitle() {
        return "首页";
    }

    @Override
    public Object getContentView() {

TextView  textView = new TextView(context);
        textView.setText("首页的首页");
        textView.setTextSize(45);
        textView.setTextColor(Color.BLUE);
        textView.setBackgroundColor(Color.WHITE);
        return textView;
    }

    @Override
    public void initView() {


    }



    @Override
    public void initData() {
stateLayout.showContentView();

//        这个方法里面初始化数据 根据数据显示加载的界面



    }

    @Override
    public void initListener() {

    }


    @Override
    public void requestdataFinish(String catalog, String json) {

    }

    @Override
    public void requestdataFailed() {

    }



    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("进入主界面中的首页"); //统计页面，"MainScreen"为页面名称，可自定义
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("离开主界面中的首页");
    }
}
