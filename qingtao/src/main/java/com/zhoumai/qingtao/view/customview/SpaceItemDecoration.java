package com.zhoumai.qingtao.view.customview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.zhoumai.qingtao.utils.DensityUtils;
import com.zhoumai.qingtao.view.adapter.GalleryAdapter;
import com.zhoumai.qingtao.view.base.application.MyApp;

import static com.zhoumai.qingtao.view.base.application.MyApp.TAG;

/**
 * 设置recyleview的条目间隔距离
 *
 * Created by ${杨伟乔} on 2016/12/5.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
   GalleryAdapter mAdapter;
    int mSpace ;

    /**
     * @param space 传入的值，其单位视为dp
     */
    public SpaceItemDecoration(int space,GalleryAdapter mAdapter) {
        this.mSpace = DensityUtils.dip2px(MyApp.getContext(),space);
      this.mAdapter = mAdapter;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int itemCount = mAdapter.getItemCount();
        int pos = parent.getChildAdapterPosition(view);
        Log.d(TAG, "itemCount>>" +itemCount + ";Position>>" + pos);

        outRect.left = 0;
        outRect.top = 0;
        outRect.bottom = 0;


        if (pos != (itemCount -1)) {
            outRect.right = mSpace;
        } else {
            outRect.right = 0;
        }
    }
}