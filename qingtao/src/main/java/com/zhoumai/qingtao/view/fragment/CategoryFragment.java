package com.zhoumai.qingtao.view.fragment;

import android.widget.TextView;

import com.zhoumai.qingtao.model.Address;
import com.zhoumai.qingtao.utils.JsonUtil;
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
stateLayout.showEmptyView();
    }

    @Override
    public void onRequestFinish(String json) {
//解析数据
        Address address = JsonUtil.parseJsonToBean(json, Address.class);

        //检查数据
    }
}
