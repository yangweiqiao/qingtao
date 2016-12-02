package com.zhoumai.qingtao.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

/**
 * Created by yangweiqiao on 2016/8/26.
 */
public abstract class MySuperListViewAdapter extends BaseAdapter {


    private final List<?> list;

    public MySuperListViewAdapter(List<?> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaseListViewViewHolder holder;
        if (convertView == null) {

            holder =  setHolder();
            //convertView = View.inflate(parent.getContext(), holder.getItemId(), null);

            // TODO: 2016/12/2 这里为了避免未知的错误,直接使用的是三个参数的方法  
            LayoutInflater.from(parent.getContext()).inflate(holder.getItemId(),parent,false);

            convertView.setTag(holder);
            //添加自动适配 
            AutoUtils.autoSize(convertView);
        } else {

            holder = (BaseListViewViewHolder) convertView.getTag();
        }
        holder.setDatas(convertView, list.get(position));
        return convertView;
    }

      public abstract BaseListViewViewHolder setHolder();

}

