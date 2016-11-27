package com.zhoumai.qingtao.view.adapter;

import android.view.View;
import android.widget.ListAdapter;

import java.util.List;

/**
 * Created by ${杨伟乔} on 2016/11/27.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class HomeListAdapter extends MySuperListViewAdapter {
    public HomeListAdapter(List<?> list) {
        super(list);
    }

    @Override
    public BaseListViewViewHolder setHolder() {
        return new HomeViewHolder();
    }


    class HomeViewHolder extends  BaseListViewViewHolder{

        @Override
        public void setDatas(View view, Object obj) {

        }

        @Override
        public int getItemId() {
            return 0;
        }
    }
}
