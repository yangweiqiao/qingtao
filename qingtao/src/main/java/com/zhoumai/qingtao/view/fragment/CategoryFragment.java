package com.zhoumai.qingtao.view.fragment;

import android.widget.TextView;

import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;


/**
 * Created by 杨伟乔 on 2016/11/23.
 * 邮箱:  yangweiqiao@126.com
 * CSDN: www.csdn.net/yangweiqiao
 * 神兽保佑,代码永无BUG
 */

public class CategoryFragment extends BaseFragemnt {
    @Override
    public CharSequence getTitle() {
        return "分类";
    }

    @Override
    public Object getContentView() {
        TextView textView = new TextView(context);
        textView.setText("你好.这是我的分类界面,显示的是加载成功的界面 ");
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
    public void requestdataFinish(String catalog, Object bean) {

    }

    @Override
    public void requestdataFailed() {

    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("CategoryFragment"); //统计页面，"MainScreen"为页面名称，可自定义
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("CategoryFragment");
    }
}
