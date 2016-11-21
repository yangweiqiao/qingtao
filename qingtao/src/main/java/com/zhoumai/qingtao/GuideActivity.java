package com.zhoumai.qingtao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.zhoumai.qingtao.utils.ActivityFinishUtils;
import com.zhoumai.qingtao.utils.DensityUtil;
import com.zhoumai.qingtao.base.baseapplication.MyApp;
import com.zhoumai.qingtao.utils.SpUtils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ywq on 2016/11/21.
 * 引导的界面
 * 我们需要添加界面的时候只需要添加图片即可
 * 实现了下面的圆点指示器
 */
public class GuideActivity extends Activity implements View.OnClickListener {


    @BindView(R.id.vp_guide_bg)
    ViewPager vpGuideBg;
    @BindView(R.id.ll_guide_points)
    LinearLayout llGuidePoints;  //放置圆点的线性布局
    @BindView(R.id.iv_guide_bigpoint)
    ImageView ivGuideBigpoint; //滑动时候会移动的圆点 
    @BindView(R.id.bt_guide_start)
    Button btGuideStart;  //开始按钮 

    //引导界面图片控件
    ArrayList<ImageView> imgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ActivityFinishUtils.addActivity(this);
        ButterKnife.bind(this);
        btGuideStart.setOnClickListener(this);//监听开始按钮
        initData();
        initAdapter();
    }

    /**
     * 设置是适配器
     */
    private void initAdapter() {

        // 设置Adapter
        vpGuideBg.setAdapter(new MyAdapter());
        // 监听ViewPager
        vpGuideBg.setOnPageChangeListener(new MyOnPageChangeListener());
    }


    class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int position, float positionOffset,
                                   int positionOffsetPixels) {
            // 当ViewPager滑动时调用
            // 计算红点要移动的距离 = 手指移动的距离/屏幕的宽度 * 灰点的间距
            // 移动的距离 = positionOffset * 灰点的间距

            int bigPointX = (int) ((positionOffset + position) * DensityUtil.dip2px(MyApp.getContext(), 20)); //30是自己计算出来的 15灰色圆点半径 +灰色圆点之间的间距
            // 移动红点，不停的修改红点的左边距
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) ivGuideBigpoint.getLayoutParams();
            params.leftMargin = bigPointX;
            ivGuideBigpoint.setLayoutParams(params);

        }

        @Override
        public void onPageSelected(int position) {
            // 当ViewPager滑动到某一页时调用
            if (position == imgs.size() - 1) {
                btGuideStart.setVisibility(View.VISIBLE);
            } else {
                btGuideStart.setVisibility(View.GONE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }

    }

    private void initData() {
        //创建图片id的数组 
        int[] imgid = new int[]{R.mipmap.launch_01, R.mipmap.launch_02,
                R.mipmap.launch_03};
        // 根据图片id的数组创建图片集合
        imgs = new ArrayList<ImageView>();
        /**
         * 下面这个for循环 一共干了两件事 
         * 1.创建图片控件 imageView的集合 
         * 2.创建了圆点指示器的控件 
         */
        for (int i = 0; i < imgid.length; i++) {
            //创建图片控件
            ImageView imageView = new ImageView(this);
            // 给ImageView设置缩放类型
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            //设置图片 
            imageView.setImageResource(imgid[i]);
            // 设置背景时，图片能自动按控件的大小缩放
            // imageView.setBackgroundResource(imgid[i]);
            imgs.add(imageView);

            // 有几张图片，创建几个灰点
            ImageView point = new ImageView(this);
            point.setBackgroundResource(R.drawable.guide_point_normal);
            // 给灰点设置宽高,需要导包Linearlayout中的LayoutParams
            int dp2px = DensityUtil.dip2px(MyApp.getContext(), 10);// 根据手机获取15dp对应的px值
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(dp2px, dp2px);// 10指的是像素
            // 设置左边距,第一个点的左边距不要，为了让中间的灰点显示在屏幕的水平居中
            if (i != 0) {
                params.leftMargin = dp2px;
            }
            point.setLayoutParams(params);
            // 把灰点添加到线性容器
            llGuidePoints.addView(point);
        }
    }

    /**
     * viewpager的适配器  后期考虑抽取 暂时先这样
     */
    // TODO: 2016/11/21  
    class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return imgs.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // 把对应位置的图片添加到ViewPager中
            ImageView imageView = imgs.get(position);
            container.addView(imageView);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

    }


    public void onResume() {
        super.onResume();
        //  MobclickAgent.onResume(this);
    }

    public void onPause() {
        super.onPause();
        //MobclickAgent.onPause(this);
    }


    /**
     * 开始按钮的监听器
     *
     * @param view
     */
    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, MainActivity.class));
        // 把是否应用第一次打开标记保存为true
        SpUtils.setBoolean("is_first", true);
        finish();
    }
}



