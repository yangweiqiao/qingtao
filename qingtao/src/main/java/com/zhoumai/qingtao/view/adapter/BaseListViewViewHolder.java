package com.zhoumai.qingtao.view.adapter;

import android.view.View;

/**
 *
 *
 * Created by yangweiqiao on 2016/8/27.
 */
public abstract class BaseListViewViewHolder {
    /**
     * 设置条目上的数据
     * @param view
     * @param obj
     */
    public abstract void setDatas(View view, Object obj);

    /**
     * 提供条目的布局id
     * @return
     */
    public abstract int getItemId();
}





