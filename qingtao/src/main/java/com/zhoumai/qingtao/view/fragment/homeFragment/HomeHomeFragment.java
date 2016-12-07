package com.zhoumai.qingtao.view.fragment.homeFragment;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ToxicBakery.viewpager.transforms.DepthPageTransformer;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.NET.JsonUtil;
import com.zhoumai.qingtao.NET.NetUtils;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.ceshi;
import com.zhoumai.qingtao.utils.DensityUtils;
import com.zhoumai.qingtao.view.adapter.BaseListViewViewHolder;
import com.zhoumai.qingtao.view.adapter.CarouselViewpagerAdapter;
import com.zhoumai.qingtao.view.adapter.HomeGridViewAdapter;
import com.zhoumai.qingtao.view.adapter.MySuperListViewAdapter;
import com.zhoumai.qingtao.view.base.application.MyApp;
import com.zhoumai.qingtao.view.customview.Noscollgridview;
import com.zhoumai.qingtao.view.customview.NoscrollListview;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ${杨伟乔} on 2016/11/30.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 * <p>
 * 轮播图的适配器设置在最下面轮播图指示器创建的方法中
 */

/**
 * 这是首页上面的那个首页界面
 * 1.最上面是一个viewpager
 * 2.下面可以是一个listview控件
 */
public class HomeHomeFragment extends BaseFragemnt {
    //轮播图
    public ViewPager homeViewpager;


    private int currentItem;
    private InternalHandler mHandler=new InternalHandler();
    private ArrayList<String> list;
    private LinearLayout homeTab2;
    private ImageView bigpoint;
    private ImageView homeImgXl;
    private ImageView homeImgBk;
    private ImageView homeImgPp;
    private ImageView homeImgFx;
    private Noscollgridview homeGridviewxl;
    private Noscollgridview homeGridviewbk;
    private Noscollgridview homeGridviewpp;
    private Noscollgridview homeGridviewfx;


    @Override
    public CharSequence getTitle() {
        return "首页";
    }

    @Override
    public Object getContentView() {
        //返回首页中首页的布局id
        return R.layout.home_home;
    }

    @Override
    public void initView() {

        //限量闪购的大图标
        homeImgXl = findView(R.id.home_img_xl);
        //爆款拼团的大图标
        homeImgBk = findView(R.id.home_img_bk);
        //品牌直购的大图标
        homeImgPp = findView(R.id.home_img_pp);
        //轻淘返现的大图标
        homeImgFx = findView(R.id.home_img_fx);
/**
 * 四个gridView  限量闪购 爆款拼团 品牌直购 轻淘返现
 */
        homeGridviewxl = findView(R.id.home_gridviewxl);
        homeGridviewbk = findView(R.id.home_gridviewbk);
        homeGridviewpp = findView(R.id.home_gridviewpp);
        homeGridviewfx = findView(R.id.home_gridviewfx);

/**
 * 首页的轮播图
 */
        homeViewpager = findView(R.id.home_home_viewpager);
//1.设置viewpager页面之间的间距
        homeViewpager.setPageMargin((int) getResources().getDimensionPixelOffset(R.dimen.x20));//设置viewpager每个页卡的间距，与gallery的spacing属性类似
        homeViewpager.setPageTransformer(true, new DepthPageTransformer());
        /**2.轮播图的指示器**/
        homeTab2 = findView(R.id.home_tab2);
        /**3.轮播图的指示器上面滑动的那个大的点**/
        bigpoint = findView(R.id.iv__bigpoint);
    }


    @Override
    public void initData() {
//        根据网络的请求结果设置数据?
        /**1.请求轮播图的数据**/
        list = new ArrayList<>();
        list.add("http://img06.tooopen.com/images/20161019/tooopen_sy_182404543971.jpg");
        list.add("http://img06.tooopen.com/images/20160922/tooopen_sy_179739052216.jpg");
        list.add("http://img06.tooopen.com/images/20160918/tooopen_sy_179079234932.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=1678434878,366234459&fm=23&gp=0.jpg");
        creatPoint();
        /**2.请求页面分类限量闪购的信息**/
        /**3.请求页面分类爆款拼团的信息**/
        /**4.请求页面分类品牌直购的信息**/
        /**5.请求页面分类轻淘返现的信息**/


        //设置listview的数据
        NetUtils.requestData("/mobi/product/catBrand", null, this,ceshi.class, true);

// TODO: 2016/12/6 这里根据请求的数据显示内容  
        stateLayout.showContentView();

//        这个方法里面初始化数据 根据数据显示加载的界面
//设置限量闪购的信息

        homeImgXl.setImageResource(R.mipmap.shangou);
        homeImgBk.setImageResource(R.mipmap.pintuan);
        homeImgFx.setImageResource(R.mipmap.fanxian);
        homeImgPp.setImageResource(R.mipmap.zhigou);

//设置爆款拼团的信息
//设置品牌直购的信息
//设置轻淘返现的信息
        //这一步的前提是list集合已经存在  可以添加到创建原点的方法中
        homeViewpager.setAdapter(new CarouselViewpagerAdapter(list));
    }


    @Override
    public void initListener() {
        lunbotuListener();


    }




    @Override
    public void requestdataFinish(String key, Object bean) {
        /**
         * 这个是返回的数据  在子线程的数据  我们需要在主线程操作数据
         */
        switch (key) {
            case "/mobi/product/catBrand":

//
//                ceshi ceshi = JsonUtil.parseJsonToBean(json, ceshi.class);
//
//                System.out.println("测试:" + json);
//
//                List<com.zhoumai.qingtao.ceshi.ResultBean> result =
//                        ceshi.getResult();
                Message message = new Message();

                //message.obj = result;
                message.what = 1;
                mHandler.sendMessage(message);


                break;


            case "":

                break;

        }
    }

    @Override
    public void requestdataFailed() {

    }


    public void onResume() {
        super.onResume();
        if (mHandler == null) {
            return;
        }
        // 移除Handler对应消息队列中的回调和消息
        mHandler.removeCallbacksAndMessages(null);
//        mHandler.postDelayed(new AutoSwitchPagerRunnable(), 5000);// 自动切换图片的子线程

        MobclickAgent.onPageStart("进入主界面中的首页"); //统计页面，"MainScreen"为页面名称，可自定义
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mHandler == null) {
           return;
        }
        // 移除Handler对应消息队列中的回调和消息
        mHandler.removeCallbacksAndMessages(null);

    }


    public void onPause() {
        super.onPause();

        MobclickAgent.onPageEnd("离开主界面中的首页");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        homeViewpager = null;
    }


    /**
     * 创建handler来完场图片的自动轮播
     */

    /**
     * @author andong
     *         内部消息处理器
     */
    class InternalHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {


            switch (msg.what) {
/**
 * 根据类型加载数据
 */

                case 1:
                  //  List<com.zhoumai.qingtao.ceshi.ResultBean> list1 = (List<ceshi.ResultBean>) msg.obj;

                    ArrayList<String> list1 = new ArrayList<>();

                    for(int i=0; i<9; i++){
                        list1.add("suibiajk");

                    }

                    //加载数据
// TODO: 2016/12/6 测试第一个模块返回的数据
//限量闪购的界面的数据  要固定的三行  我们需要设置这里的数据是9个对象

                    homeGridviewxl.setAdapter(new HomeGridViewAdapter(list1));
                    homeGridviewbk.setAdapter(new HomeGridViewAdapter(list1));
                    homeGridviewpp.setAdapter(new HomeGridViewAdapter(list1));
                    homeGridviewfx.setAdapter(new HomeGridViewAdapter(list1));


            }


            // 切换图片.
            int currentItem = (homeViewpager.getCurrentItem() + 1) % homeViewpager.getAdapter().getCount();
            homeViewpager.setCurrentItem(currentItem);
            postDelayed(new AutoSwitchPagerRunnable(), 8000);
//接收到消息后，隔3秒后再次执行自动切换，这样就可以实现轮播


        }
    }


    /**
     * @authorwangdh 自动切换图片的子线程
     */
    class AutoSwitchPagerRunnable implements Runnable {
        @Override
        public void run() {
            // 得到一个消息发送给handler中的handleMessage方法.
            mHandler.obtainMessage().sendToTarget();
        }
    }


    /**
     * 根据图片集合的数量判断点的数量
     */
    private void creatPoint() {

        if (list == null) {
            return;

        }


        //根据轮播图数量创建灰色点
        for (int i = 0; i < list.size(); i++) {

            // 有几张图片，创建几个灰点
            ImageView point = new ImageView(getActivity());
            point.setBackgroundResource(R.drawable.guide_point_normal);
            // 给灰点设置宽高,需要导包Linearlayout中的LayoutParams
            // int dp2px = DensityUtils.dip2px(MyApp.getContext(), 10);// 根据手机获取15dp对应的px值
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(20, 20);// 10指的是像素

            // 设置左边距,第一个点的左边距不要，为了让中间的灰点显示在屏幕的水平居中
            if (i != 0) {
                params.leftMargin = 36;
            }
            point.setLayoutParams(params);
            // 把灰点添加到线性容器
            homeTab2.addView(point);


        }




    }

    private void lunbotuListener() {
        /**
         * 设置viewpager的监听方法
         */
        if (homeViewpager == null) {
            return;
        }
        homeViewpager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                //获取的是点击条目的id
                position = position % list.size();

                System.out.println(list.get(position));


            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);

                position = (position) % list.size() - 1;
                if (position == -1) {
                    position = position + 1;

                }

                // 当ViewPager滑动时调用
                // 计算红点要移动的距离 = 手指移动的距离/屏幕的宽度 * 灰点的间距
                // 移动的距离 = positionOffset * 灰点的间距

                int bigPointX = (int) ((positionOffset + position) * DensityUtils.dip2px(MyApp.getContext(), 19)); //20是自己计算出来的 10灰色圆点半径 +灰色圆点之间的间距
                // 移动红点，不停的修改红点的左边距
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) bigpoint.getLayoutParams();
                params.leftMargin = bigPointX;
                bigpoint.setLayoutParams(params);


            }


        });
    }


}
