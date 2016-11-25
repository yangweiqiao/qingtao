package com.zhoumai.qingtao.view.fragment;

import android.view.View;
import android.widget.TextView;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.view.base.application.MyApp;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;




/**
 * Created by 杨伟乔 on 2016/11/23.
 * 邮箱:  yangweiqiao@126.com
 * CSDN: www.csdn.net/yangweiqiao
 * 神兽保佑,代码永无BUG
 */

public class MeFragment extends BaseFragemnt {
    @Override
    public CharSequence getTitle() {
        return "我的";
    }

    @Override
    public Object getContentView() {

        View.inflate(MyApp.getContext(), R.layout.fragment_me,null);

        TextView textView = new TextView(context);
        textView.setText("你好.这是我的界面,显示的是加载成功的界面 ");
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

    }

    @Override
    public void onRequestFinish(String json) {

    }
}
