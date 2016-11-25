package com.zhoumai.qingtao.view.fragment;

import android.widget.TextView;

import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;

/**
 * Created by 杨伟乔 on 2016/11/23.
 * 邮箱:  yangweiqiao@126.com
 * CSDN: www.csdn.net/yangweiqiao
 * 神兽保佑,代码永无BUG
 */

public class HomeFragment extends BaseFragemnt {
    @Override
    public CharSequence getTitle() {
        return "首页";
    }

    @Override
    public Object getContentView() {
        TextView textView = new TextView(context);
        textView.setText("你好.这是主界面,显示的是加载成功的界面 ");
        return textView;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        stateLayout.showContentView();
    }

    @Override
    public void onRequestFinish(String json) {

    }
}
