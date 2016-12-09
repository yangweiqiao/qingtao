package com.zhoumai.qingtao.view.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.Toastutils;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * Created by ${杨伟乔} on 2016/11/27.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */

public class CarouselViewpagerAdapter extends PagerAdapter {
    static ArrayList<String> imgurls;
    private CarouselViewpagerAdapter.OnItemClickLitener mOnItemClickLitener1;


    public CarouselViewpagerAdapter(ArrayList imgurls) {

        this.imgurls = imgurls;
    }

    @Override
    public int getCount() {
        return imgurls.size() * 10000 * 5000;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // 把对应位置的图片添加到ViewPager中
        position = position % imgurls.size();

        //创建图片控件
        final ImageView view = new ImageView(container.getContext());

        view.setAdjustViewBounds(true);
        //设置缩放模式
        view.setScaleType(ImageView.ScaleType.FIT_XY);
        //添加到容器中
        container.addView(view);
        //设置图片的内容
        ImageLoader.getInstance().displayImage(imgurls.get(position), view); //参数url地址和view控件
        System.out.println("无语中1222");
        //如果设置了回调，则设置点击事件
        if (mOnItemClickLitener1 != null) {
            final int finalPosition = position;
            System.out.println("无语中1111");

            view.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    System.out.println("无语中222");
                    mOnItemClickLitener1.onItemClick(view, finalPosition);
                }
            });

        }

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }


    /**
     * ItemClick的回调接口
     *
     * @author ywq
     */
    public interface OnItemClickLitener {
        void onItemClick(View view, int position);

    }


    public void setOnItemClickLitener(CarouselViewpagerAdapter.OnItemClickLitener mOnItemClickLitener) {
        mOnItemClickLitener1 = mOnItemClickLitener;
        System.out.println("我就是无语了很啊 ");
    }


}
