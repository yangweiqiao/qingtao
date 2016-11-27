package com.zhoumai.qingtao.view.fragment;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ToxicBakery.viewpager.transforms.ZoomOutTranformer;
import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.T;
import com.zhoumai.qingtao.view.adapter.CarouselViewpagerAdapter;
import com.zhoumai.qingtao.view.adapter.HomeListAdapter;
import com.zhoumai.qingtao.view.base.application.MyApp;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;

import java.util.ArrayList;


/**
 * Created by 杨伟乔 on 2016/11/23.
 * 邮箱:  yangweiqiao@126.com
 * CSDN: www.csdn.net/yangweiqiao
 * 神兽保佑,代码永无BUG
 */

public class HomeFragment extends BaseFragemnt implements View.OnClickListener {
    /*首页 */
    TextView privateTabHome;
    /*限量 */
    TextView privateTabXianliang;
    /*拼团 */
    TextView privateTabPintuan;
    /*品牌*/
    TextView privateTabPinpai;
    /*返现 */
    TextView privateTabQingtaofanxian;

    TextView privateCeshi;

    /*文字底部的图片指示器 */
    ImageView privateImg1;
    /*文字底部的图片指示器 */
    ImageView privateImg2;
    /*文字底部的图片指示器 */
    ImageView privateImg3;
    /*文字底部的图片指示器 */
    ImageView privateImg4;
    /*文字底部的图片指示器 */
    ImageView privateImg5;
    /*文字底部的图片指示器 */
    ImageView privateImg6;
    /*
    轮播图
     */
    ViewPager privateViewpager;

    //加载网络图片的地址 集合
    ArrayList<String> imgurls;

    @Override
    public CharSequence getTitle() {
        return "首页";
    }

    @Override
    public Object getContentView() {
/**
 * 加载内容布局
 */
        View view = View.inflate(MyApp.getContext(), R.layout.fragment_home, null);

        return view;
    }


    @Override
    public void initData() {


        //创建图片地址的集合

        imgurls = new ArrayList<>();
        imgurls.add("http://img.cndfjy.com/attachment/month_1307/1307122218f8376a8aba953fbc.jpg");
        imgurls.add("http://img.cndfjy.com/attachment/month_1307/1307122218f8376a8aba953fbc.jpg");
        imgurls.add("http://img.cndfjy.com/attachment/month_1307/1307122218f8376a8aba953fbc.jpg");
        imgurls.add("http://img.cndfjy.com/attachment/month_1307/1307122218f8376a8aba953fbc.jpg");
        imgurls.add("http://img.cndfjy.com/attachment/month_1307/1307122218f8376a8aba953fbc.jpg");
        privateViewpager.setPageTransformer(true, new ZoomOutTranformer());

        CarouselViewpagerAdapter carouselViewpagerAdapter = new CarouselViewpagerAdapter(imgurls);
        privateViewpager.setAdapter(carouselViewpagerAdapter);

        privateViewpager.setCurrentItem(0);
        //privateViewpager.setPageTransformer(true, new ZoomOutSlideTransformer());
    }


    @Override
    public void requestdataFinish(String json) {

    }

    @Override
    public void requestdataFailed() {

    }


    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("HomeFragment"); //统计页面，"MainScreen"为页面名称，可自定义
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("HomeFragment");
    }


    /**
     * 点击事件
     *
     * @param view
     */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tab_home:
                T.showToast("首页");

                privateImg1.setVisibility(View.VISIBLE);
                privateImg2.setVisibility(View.GONE);
                privateImg3.setVisibility(View.GONE);
                privateImg4.setVisibility(View.GONE);
                privateImg5.setVisibility(View.GONE);
                privateImg6.setVisibility(View.GONE);

                break;
            case R.id.tab_xianliang:
                T.showToast("限量");

                privateImg2.setVisibility(View.VISIBLE);
                privateImg1.setVisibility(View.GONE);
                privateImg3.setVisibility(View.GONE);
                privateImg4.setVisibility(View.GONE);
                privateImg5.setVisibility(View.GONE);
                privateImg6.setVisibility(View.GONE);

                break;
            case R.id.tab_pintuan:
                T.showToast("拼团");

                privateImg3.setVisibility(View.VISIBLE);
                privateImg2.setVisibility(View.GONE);
                privateImg1.setVisibility(View.GONE);
                privateImg4.setVisibility(View.GONE);
                privateImg5.setVisibility(View.GONE);
                privateImg6.setVisibility(View.GONE);
                break;
            case R.id.tab_pinpai:
                T.showToast("品牌");

                privateImg4.setVisibility(View.VISIBLE);
                privateImg2.setVisibility(View.GONE);
                privateImg3.setVisibility(View.GONE);
                privateImg1.setVisibility(View.GONE);
                privateImg5.setVisibility(View.GONE);
                privateImg6.setVisibility(View.GONE);
                break;
            case R.id.tab_qingtaofanxian:
                T.showToast("返现");

                privateImg5.setVisibility(View.VISIBLE);
                privateImg2.setVisibility(View.GONE);
                privateImg3.setVisibility(View.GONE);
                privateImg4.setVisibility(View.GONE);
                privateImg1.setVisibility(View.GONE);
                privateImg6.setVisibility(View.GONE);
                break;
            case R.id.ceshi:
                T.showToast("测试");

                privateImg6.setVisibility(View.VISIBLE);
                privateImg2.setVisibility(View.GONE);
                privateImg3.setVisibility(View.GONE);
                privateImg4.setVisibility(View.GONE);
                privateImg5.setVisibility(View.GONE);
                privateImg1.setVisibility(View.GONE);
                break;
        }
    }


//    @OnClick(R.id.card)
//    public void onClick() {
//
//
//        T.showToast("被点击了");
//    }

    /**
     * 初始化控件
     */
    @Override
    public void initView() {
        stateLayout.showContentView();
        privateTabHome = findView(R.id.tab_home);
        privateTabXianliang = findView(R.id.tab_xianliang);
        privateTabPintuan = findView(R.id.tab_pintuan);
        privateTabPinpai = findView(R.id.tab_pinpai);
        privateTabQingtaofanxian = findView(R.id.tab_qingtaofanxian);
        privateCeshi = findView(R.id.ceshi);

        privateImg1 = findView(R.id.img1);
        privateImg2 = findView(R.id.img2);
        privateImg3 = findView(R.id.img3);
        privateImg4 = findView(R.id.img4);
        privateImg5 = findView(R.id.img5);
        privateImg6 = findView(R.id.img6);
        privateViewpager = findView(R.id.viewpager);

        PullToRefreshListView view = findView(R.id.home_listview);
        /**
         * 设置下拉刷新和上拉加载的文字显示
         */

        ILoadingLayout header = view.getLoadingLayoutProxy(true, false);
        header.setLoadingDrawable(null);
        header.setPullLabel("下拉刷新");
        header.setReleaseLabel("松开刷新");
        header.setRefreshingLabel("正在刷新...");
        ILoadingLayout footer = view.getLoadingLayoutProxy(false, true);
        footer.setPullLabel("上拉加载更多");
        footer.setReleaseLabel("松开加载更多");
        footer.setRefreshingLabel("正在加载...");

        //监听方法 下拉
        view.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                //调用联网查数据的方法
            }
        });
        //监听 上拉
        view.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {

            }
        });
//        在获取数据的方法中判断模式 然后去请求对应的数据
        // view.getCurrentMode()== PullToRefreshBase.Mode.PULL_FROM_START;
        view.setAdapter(new HomeListAdapter(null));

//指定的条目滑动到最顶端
        // list.setSelection(position - 1);

        /**
         * getListView().setOnScrollListener(new OnScrollListener() {
        @Override public void onScrollStateChanged(AbsListView view, int scrollState) {
        }

        @Override public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        if(firstVisibleItem==0){
        Log.e("log", "滑到顶部");
        }
        if(visibleItemCount+firstVisibleItem==totalItemCount){
        Log.e("log", "滑到底部");
        }
        }
        });
         */

    }

    /**
     * 监听控件的事件
     */
    @Override
    public void initListener() {


        privateTabHome.setOnClickListener(this);
        privateTabXianliang.setOnClickListener(this);
        privateTabPintuan.setOnClickListener(this);
        privateTabPinpai.setOnClickListener(this);
        privateTabQingtaofanxian.setOnClickListener(this);
        privateCeshi.setOnClickListener(this);

    }
}
