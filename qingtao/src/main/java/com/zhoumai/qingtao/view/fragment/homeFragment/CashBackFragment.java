package com.zhoumai.qingtao.view.fragment.homeFragment;

import android.graphics.Color;
import android.widget.TextView;

/**
 * Created by ${杨伟乔} on 2016/11/30.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class CashBackFragment extends com.zhoumai.qingtao.view.fragment.base.BaseFragemnt {
    @Override
    public CharSequence getTitle() {
        return "轻淘返现";
    }

    @Override
    public Object getContentView() {
        TextView  textView = new TextView(context);
        textView.setText("首页的轻淘返现");
        textView.setTextSize(45);
        textView.setTextColor(Color.BLUE);
        textView.setBackgroundColor(Color.WHITE);
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
}
